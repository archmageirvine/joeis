package irvine.oeis.a054;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054255 Triangle T(n,k) (n &gt;= 1, 0&lt;=k&lt;=n) giving number of preferential arrangements of n things beginning with k (transposed, then read by rows).
 * @author Sean A. Irvine
 */
public class A054255 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private int mK = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (--mK <= 0) {
      mK = ++mN;
      mSum = Z.ZERO;
    }
    mSum = mSum.add(Stirling.secondKind(mN, mK).multiply(mF.factorial(mK - 1)));
    return mSum;
  }
}
