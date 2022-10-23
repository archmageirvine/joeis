package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055490 Factorial primes: primes of the form n! - 1.
 * @author Sean A. Irvine
 */
public class A055490 extends Sequence1 {

  private long mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      final Z t = mF.subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
