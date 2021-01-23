package irvine.oeis.a033;

import irvine.math.z.Z;

/**
 * A033859 Numbers k such that A033831(k) = A034444(k) where A034444(k) = number of unitary divisors of k.
 * @author Sean A. Irvine
 */
public class A033859 extends A033831 {

  @Override
  public Z next() {
    while (true) {
      final Z j = super.next();
      if (j.equals(mFactorSequence.unitarySigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
