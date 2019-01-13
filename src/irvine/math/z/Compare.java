package irvine.math.z;

/**
 * Comparison functions.
 *
 * @author Sean A. Irvine
 */
final class Compare {

  private Compare() { }

  /**
   * Test if two numbers have the same value.
   *
   * @param a number
   * @param n number
   * @return true if both numbers have the same value
   */
  static boolean equals(final Z a, final Object n) {
    if (n == a) {
      return true;
    }
    if (!(n instanceof Z)) {
      return false;
    }
    final Z nn = (Z) n;
    if (a.getSize() != nn.getSize()) {
      return false;
    }
    final int len = Math.abs(a.getSize());
    for (int i = 0; i < len; ++i) {
      if (a.mValue[i] != nn.mValue[i]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Return -1, 0, or +1 depending on whether a &lt; b, a = b, or
   * a &gt; b, respectively
   *
   * @param a first number
   * @param b second number
   * @return comparison of a and b
   */
  static int compare(final Z a, final Z b) {
    if (a == b) {
      return 0;
    }
    final int sb = b.getSize();
    int sa = a.getSize();
    if (sa < sb) {
      return -1;
    }
    if (sa > sb) {
      return 1;
    }
    if (sa < 0) {
      sa = -sa;
    }
    while (sa-- > 0) {
      if (a.mValue[sa] > b.mValue[sa]) {
        return sb < 0 ? -1 : 1;
      }
      if (a.mValue[sa] < b.mValue[sa]) {
        return sb < 0 ? 1 : -1;
      }
    }
    return 0;
  }

}
