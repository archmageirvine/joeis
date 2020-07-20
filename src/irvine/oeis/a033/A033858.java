package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033858 Numbers k such that <code>j(k) + ud(k) = d(k)</code>, where <code>j(k) = A033831, ud(k) =</code> number of unitary divisors of k <code>(A034444), d(k) =</code> number of divisors of k <code>(A000005)</code>.
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
