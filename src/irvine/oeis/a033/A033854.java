package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033854 Numbers k such that <code>j(k)*ud(k)=phi(k), j(n) = A033831, ud(n) =</code> number of unitary divisors of <code>n (A034444)</code>.
 * @author Sean A. Irvine
 */
public class A033854 extends A033831 {

  @Override
  public Z next() {
    while (true) {
      final Z j = super.next();
      if (j.multiply(mFactorSequence.unitarySigma0()).equals(mFactorSequence.phi())) {
        return Z.valueOf(mN);
      }
    }
  }
}
