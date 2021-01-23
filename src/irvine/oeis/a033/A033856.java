package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A033856 Numbers k such that j(k)*phi(k) = sigma(phi(k)), j(k) = A033831(k).
 * @author Sean A. Irvine
 */
public class A033856 extends A033831 {

  @Override
  public Z next() {
    while (true) {
      final Z j = super.next();
      final Z phi = mFactorSequence.phi();
      if (j.multiply(phi).equals(Cheetah.factor(phi).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
