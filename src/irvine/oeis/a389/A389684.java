package irvine.oeis.a389;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389684 Number of representations of n as binomial(i,4) + binomial(j,3) + binomial(k,2) + binomial(l,1) with i,j,k,l&gt;=0.
 * @author Sean A. Irvine
 */
public class A389684 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long i = 0, bi; (bi = mN - Binomial.binomial(i, 4).longValueExact()) >= 0; ++i) {
      for (long j = 0, bj; (bj = bi - Binomial.binomial(j, 3).longValueExact()) >= 0; ++j) {
        for (long k = 0; bj - Binomial.binomial(k, 2).longValueExact() >= 0; ++k) {
          ++count;
        }
      }
    }
    return Z.valueOf(count);
  }
}

