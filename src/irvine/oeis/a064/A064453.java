package irvine.oeis.a064;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064453 Number of finite positive integer sequences b(1),...,b(k), with k &lt;= n and b(1)*b(2)*...*b(k) &lt;= n.
 * @author Sean A. Irvine
 */
public class A064453 extends Sequence1 {

  private int mN = 0;
  private Z mCount = Z.ZERO;

  private void search(final int[] counts, final int totalParts, final int prevPart, final int product) {
    if (totalParts == mN) {
      return;
    }
    for (int part = prevPart; part * product <= mN; ++part) {
      ++counts[part];
      mCount = mCount.add(Binomial.multinomial(totalParts + 1, counts));
      search(counts, totalParts + 1, part, product * part);
      --counts[part];
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = Z.ZERO;
    search(new int[mN + 1], 0, 1, 1);
    return mCount;
  }
}
