package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073309 Primes of the form k! + k + 1.
 * @author Sean A. Irvine
 */
public class A073309 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mF = mF.multiply(mN);
      }
      final Z t = mF.add(mN + 1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

