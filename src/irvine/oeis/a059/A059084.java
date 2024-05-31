package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059084 Triangle T(n,m) of number of labeled n-node T_0-hypergraphs with m distinct hyperedges (empty hyperedge included), m=0,1,...,2^n.
 * @author Sean A. Irvine
 */
public class A059084 extends Sequence0 {

  private int mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > 1L << mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mN, k -> Functions.STIRLING1.z(mN, (long) k).multiply(Binomial.binomial(1L << k, mM)));
  }
}
