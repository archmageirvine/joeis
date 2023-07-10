package irvine.oeis.a180;
// manually 2023-07-10

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a179.A179781;

/**
 * A180750 a(n) = DP(n) is the total number of k-double-palindromes of n, where 2 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A180750 extends Sequence1 {

  private int mN = 0;
  private final A179781 mSeq1 = new A179781();
  private final A180249 mSeq2 = new A180249();

  @Override
  public Z next() {
    ++mN;
    return mSeq2.next().subtract(mSeq1.next());
  }
}
