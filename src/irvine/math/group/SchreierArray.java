package irvine.math.group;

import irvine.util.array.DynamicIntArray;

/**
 * Schreier vector.
 * @author Sean A. Irvine
 */
final class SchreierArray extends DynamicIntArray {

  // Reserves -1 and -2 for special values, but shift everything by 2 internally
  // so that we don't have to worry about newly accessed portions of the array.

  @Override
  public void set(final int position, final int num) {
    super.set(position, num + 2);
  }

  @Override
  public int get(final int i) {
    return super.get(i) - 2;
  }
}
