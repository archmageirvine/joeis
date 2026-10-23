package irvine.math.predicate;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Test if a number is a pandigital number in some base, that is each digit of that base occurs at least once.
 * @author Georg Fischer
 */
public class Pandigital extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public boolean is(final long base, final Z n) {
    final int[] dc = ZUtils.digitCounts(n, (int) base);
    for (int i = 0; i < base; ++i) {
      if (dc[i] == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean is(final long base, final long n) {
    final int[] dc = ZUtils.digitCounts(n, (int) base);
    for (int i = 0; i < base; ++i) {
      if (dc[i] == 0) {
        return false;
      }
    }
    return true;
  }
}
