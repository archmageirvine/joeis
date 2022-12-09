package irvine.oeis.a332;
// manually anopan 

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A332958 Number of labeled forests with 2n nodes consisting of n-1 isolated nodes and a labeled tree with n+1 nodes.
 * @author Georg Fischer
 */
public class A332958 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(n) = C(2*n,n-1) * (n+1)^(n-1).
    ++mN;
    return Binomial.binomial(mN * 2, mN - 1).multiply(Z.valueOf(mN + 1).pow(mN - 1));
  }
}
