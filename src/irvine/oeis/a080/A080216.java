package irvine.oeis.a080;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080216 a(n) is the largest value taken by binomial(n,j) mod j for j in [1..n].
 * @author Sean A. Irvine
 */
public class A080216 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      max = max.max(Binomial.binomial(mN, k).mod(k));
    }
    return max;
  }
}

