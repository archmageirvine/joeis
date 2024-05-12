package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * Test if a number is <code>k</code>-polygonal.
 * @author Sean A. Irvine
 */
class Polygonal extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 3;
  }

  @Override
  public boolean is(final long k, final Z n) {
    if (n.isZero()) {
      return true;
    }
    final Z t = n.multiply(8 * (k - 2)).add((k - 4) * (k - 4));
    final Z[] s = t.sqrtAndRemainder();
    if (!s[1].isZero()) {
      return false;
    }
    return s[0].add(k - 4).mod(2 * (k - 2)) == 0;
  }
}
