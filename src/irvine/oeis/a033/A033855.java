package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A033855 Numbers k such that j(k)*phi(k) = s(phi(k)), where j(k) = A033831(k), s(k) = sigma(k) - k.
 * @author Sean A. Irvine
 */
public class A033855 extends A033831 {

  @Override
  public Z next() {
    while (true) {
      final Z j = super.next();
      final Z phi = mFactorSequence.phi();
      if (j.multiply(phi).equals(Jaguar.factor(phi).sigma().subtract(phi))) {
        return Z.valueOf(mN);
      }
    }
  }
}
