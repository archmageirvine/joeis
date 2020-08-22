package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033858 Numbers k such that j(k) + ud(k) = d(k), where j(k) = A033831, ud(k) = number of unitary divisors of k (A034444), d(k) = number of divisors of k (A000005).
 * @author Sean A. Irvine
 */
public class A033858 extends A033831 {

  @Override
  public Z next() {
    while (true) {
      final Z j = super.next();
      if (j.add(mFactorSequence.unitarySigma0()).equals(mFactorSequence.sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
