package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A033855 Numbers k such that <code>j(k)*phi(k) = s(phi(k))</code>, where <code>j(k) = A033831(k), s(k) = sigma(k) -</code> k.
 * @author Sean A. Irvine
 */
public class A033855 extends A033831 {

  @Override
  public Z next() {
    while (true) {
      final Z j = super.next();
      final Z phi = mFactorSequence.phi();
      if (j.multiply(phi).equals(Cheetah.factor(phi).sigma().subtract(phi))) {
        return Z.valueOf(mN);
      }
    }
  }
}
