package irvine.oeis.a346;

import irvine.math.IntegerUtils;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A346636 a(n) is the number of quadruples (a_1, a_2, a_3, a_4) having all terms in {1,...,n} such that there exists a quadrilateral with these side lengths.
 * @author Sean A. Irvine
 */
public class A346636 extends Sequence0 {

  private Z mSum = Z.ZERO;
  private int mN = -1;

  private void fill(final int[] sides, final int pos) {
    if (pos >= sides.length) {
      final long total = IntegerUtils.sum(sides);
      for (final int s : sides) {
        if (total - s <= s) {
          return;
        }
      }
      final int[] cnts = new int[mN + 1];
      IntegerPartition.toCountForm(sides, cnts);
      mSum = mSum.add(Binomial.multinomial(sides.length, cnts));
      return;
    }
    for (int k = sides[pos - 1]; k > 0; --k) {
      sides[pos] = k;
      fill(sides, pos + 1);
    }
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      // Update for contributions with a side of length n
      final int[] sides = {mN, 0, 0, 0};
      fill(sides, 1);
    }
    return mSum;
  }
}
