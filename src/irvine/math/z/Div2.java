package irvine.math.z;

/**
 * Division by 2.
 *
 * @author Sean A. Irvine
 */
final class Div2 {

  private Div2() { }

  /**
   * Convenience method to divide by 2. More efficient than other ways of achieving
   * this result.  Also sets the auxiliary variable.
   *
   * @param n dividend
   * @return integer divided by 2.
   */
  static Z div2(final Z n) {
    if (n.getSize() == 0) {
      return Z.ZERO;
    }
    int sa = Math.abs(n.getSize());
    final int[] c = new int[sa--];
    n.mAuxiliary = n.mValue[0] & 1;
    for (int i = 0; i < sa; ++i) {
      c[i] = n.mValue[i] >>> 1;
      if ((n.mValue[i + 1] & 1) != 0) {
        c[i] += Z.BASE >>> 1;
      }
    }
    final int csize;
    if ((c[sa] = n.mValue[sa] >>> 1) != 0) {
      csize = n.getSize();
    } else if (sa == 0) {
      csize = 0;
    } else if (n.getSize() < 0) {
      csize = -sa;
    } else {
      csize = sa;
    }
    return new Z(c, csize);
  }
}
