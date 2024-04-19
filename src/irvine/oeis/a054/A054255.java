package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054255 Triangle T(n,k) (n &gt;= 1, 0&lt;=k&lt;=n) giving number of preferential arrangements of n things beginning with k (transposed, then read by rows).
 * @author Sean A. Irvine
 */
public class A054255 extends Sequence1 {

  private int mN = 0;
  private int mK = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (--mK <= 0) {
      mK = ++mN;
      mSum = Z.ZERO;
    }
    mSum = mSum.add(Stirling.secondKind(mN, mK).multiply(Functions.FACTORIAL.z(mK - 1)));
    return mSum;
  }
}
