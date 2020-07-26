package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033852 Integers k such that <code>j(k)*phi(k) = sigma(k)</code>, where <code>j(n) = A033831(n)</code>.
 * @author Sean A. Irvine
 */
public class A033852 extends A033831 {

  @Override
  public Z next() {
    while (true) {
      final Z j = super.next();
      if (j.multiply(mFactorSequence.phi()).equals(mFactorSequence.sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
