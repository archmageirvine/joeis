package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033853 Integers k such that <code>j(k)*d(k)=phi(k)</code>, where j <code>= A033831</code>.
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
