package irvine.oeis.a055;

/**
 * A055605 Number of balanced basic magic carpets on n points.
 * @author Sean A. Irvine
 */
public class A055605 extends A055055 {

  {
    super.next();
  }

  @Override
  protected boolean isAccept(final int n, final long[] sets) {
    // Check all sets have the same size
    final int cnt = Long.bitCount(sets[0]);
    for (int k = 1; k < sets.length; ++k) {
      if (Long.bitCount(sets[k]) != cnt) {
        return false;
      }
    }
    return super.isAccept(n, sets);
  }
}
