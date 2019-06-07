package irvine.oeis.a008;

/**
 * A008929 Number of increasing sequences of Goldbach type with maximal element <code>n</code>.
 * @author Sean A. Irvine
 */
public class A008929 extends A008928 {

  // We will already have established the Goldbach property up to chain[pos - 1],
  // so only need to check from there onwards
  static boolean isGoldbach(final int[] chain, final int pos) {
    final int limit = pos > 1 ? chain[pos - 1] + 1 : 2;
    for (int v = chain[pos]; v >= limit; --v) {
      // Check v can be written as a sum of two elements
      boolean ok = false;
      for (int k = 0; k < pos; ++k) {
        final int c = chain[k];
        if (c < v && contains(chain, pos, v - c)) {
          ok = true;
          break;
        }
      }
      if (!ok) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected void search(final int[] chain, final int pos) {
    if (isGoldbach(chain, pos)) {
      super.search(chain, pos);
    }
  }
}
