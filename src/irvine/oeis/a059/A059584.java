package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059584 Triangle T(n,m) of number of labeled m-node T_0-hypergraphs with n hyperedges (empty hyperedges and multiple hyperedges included), m=0,1,...,2^n.
 * @author Sean A. Irvine
 */
public class A059584 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > 1 << mN) {
      ++mN;
      mM = 0;
    }
    final Z n = Z.valueOf(mN);
    return Integers.SINGLETON.sum(0, mM, k -> Stirling.firstKind(mM, k).multiply(Binomial.binomial(Z.ONE.shiftLeft(k).add(mN - 1), n)));
  }
}
