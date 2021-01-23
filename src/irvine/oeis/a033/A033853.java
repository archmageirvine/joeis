package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033853 Integers k such that j(k)*d(k)=phi(k), where j = A033831.
 * @author Sean A. Irvine
 */
public class A033853 extends A033831 {

  @Override
  public Z next() {
    while (true) {
      final Z j = super.next();
      if (j.multiply(mFactorSequence.sigma0()).equals(mFactorSequence.phi())) {
        return Z.valueOf(mN);
      }
    }
  }
}
