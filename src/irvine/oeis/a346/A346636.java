package irvine.oeis.a346;

import irvine.math.IntegerUtils;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A346636 allocated for Giovanni Corbelli.
 * @author Sean A. Irvine
 */
public class A346636 implements Sequence {

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
