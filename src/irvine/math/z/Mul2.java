package irvine.math.z;

/**
 * Multiply by 2.
 *
 * @author Sean A. Irvine
 */
final class Mul2 {

  private Mul2() { }

  /**
   * Convenience method to multiply by 2. More efficient
   * than other ways of achieving this result.
   *
   * @param n multiplicand
   * @return integer multiplied by 2.
   */
  static Z mul2(final Z n) {
    if (n.getSize() == 0) {
      return Z.ZERO;
    }
    int sa = n.getSize() < 0 ? -n.getSize() : n.getSize();
    final int[] c = new int[sa + 1];
    int carry = 0;
    for (int i = 0; i < sa; ++i) {
      if ((c[i] = (n.mValue[i] << 1) + carry) >= Z.BASE) {
        c[i] -= Z.BASE;
        carry = 1;
      } else {
        carry = 0;
      }
    }
    if (carry == 1) {
      c[sa++] = 1;
    }
    return new Z(c, n.getSize() < 0 ? -sa : sa);
  }

}
