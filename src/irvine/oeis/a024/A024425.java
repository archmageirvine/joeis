package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024425 [ max{S(n,m)}/max{C(n-1,m-1)} ] for m = 1,2,...,n; S(n,m) are Stirling numbers of second kind.
 * @author Sean A. Irvine
 */
public class A024425 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z maxS = Z.ZERO;
    Z maxC = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      maxS = maxS.max(Stirling.secondKind(mN, k));
      maxC = maxC.max(Binomial.binomial(mN - 1, k - 1));
    }
    return maxS.divide(maxC);
  }
}
