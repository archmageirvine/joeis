package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084416 Triangle read by rows: T(n,k) = Sum_{i=k..n} i!*Stirling2(n,i), n &gt;= 1, 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A084416 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sum(mM, mN, k -> Functions.STIRLING2.z(mN, k).multiply(Functions.FACTORIAL.z(k)));
  }
}
