package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073444 Primes of the form n! - n - 1.
 * @author Sean A. Irvine
 */
public class A073444 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      final Z t = mF.subtract(mN + 1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

