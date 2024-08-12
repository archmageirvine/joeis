package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071807 Number of pairs (x,y) such that prime(x) - prime(y) = x*tau(x) - y*tau(y), 1&lt;=x&lt;=y&lt;=n.
 * @author Sean A. Irvine
 */
public class A071807 extends Sequence1 {

  private int mCount = 0;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long pn = Functions.PRIME.l(mN);
    final long s = Functions.SIGMA0.l(mN) * mN;
    for (int j = 1; j <= mN; ++j) {
      if (pn - Functions.PRIME.l(j) == s - Functions.SIGMA0.l(j) * j) {
        ++mCount;
      }
    }
    return Z.valueOf(mCount);
  }
}
