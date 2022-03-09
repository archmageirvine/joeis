package irvine.oeis.a055;

/**
 * A055056 Number of smooth basic magic carpets on n points.
 * @author Sean A. Irvine
 */
public class A055056 extends A055055 {

  @Override
  protected boolean isAccept(final int n, final long[] sets) {
    // Check all sets have the same size
    long b = 1;
    int target = 0;
    for (int k = 0; k < n; ++k, b <<= 1) {
      int cnt = 0;
      for (final long s : sets) {
        if ((s & b) != 0) {
          ++cnt;
        }
      }
      if (k == 0) {
        target = cnt;
      } else if (target != cnt) {
        return false;
      }
    }
    return super.isAccept(n, sets);
  }
}
