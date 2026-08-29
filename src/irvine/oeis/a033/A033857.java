package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033857 Numbers k such that j(k)*phi(k) = usigma(k), where j(k) = A033831(k), and usigma(k) = sum of unitary divisors of k (A034448).
 * @author Sean A. Irvine
 */
public class A033857 extends A033831 {

  @Override
  public Z next() {
    while (true) {
      final Z j = super.next();
      if (j.multiply(mFactorSequence.phi()).equals(mFactorSequence.unitarySigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
