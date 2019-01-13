package irvine.math.z;

/**
 * Jacobi function.
 *
 * @author Sean A. Irvine
 */
final class Jacobi {

  private Jacobi() { }

  /**
   * Compute the Jacobi symbol.
   *
   * @param m first argument
   * @param n second argument
   * @return the Jacobi symbol of m and n
   * @exception ArithmeticException if <code>n</code> in nonpositive.
   */
  static int jacobi(final Z m, final Z n) {
    if (n.signum() <= 0) {
      throw new ArithmeticException("Nonpositive second argument given to jacobi");
    }
    if (m.signum() == 0) {
      return 0;
    }
    if (m.equals(Z.ONE)) {
      return 1;
    }
    if (n.equals(Z.ONE)) {
      return 1;
    }
    if (m.isEven() && n.isEven()) {
      return 0;
    }
    if (n.isEven()) {
      final int i = n.getLowestSetBit();
      final int j = i > 3 ? 8 : 1 << i;
      if ((m.intValue() & (j - 1)) != 1) {
        return -1;
      }
      return jacobi(m, n.shiftRight(i));
    }
    if (m.signum() < 0) {
      return n.testBit(1) ? -jacobi(m.negate(), n) : jacobi(m.negate(), n);
    }
    if (m.isEven()) {
      final int i = n.intValue() & 7;
      return i == 3 || i == 5 ? -jacobi(m.divide2(), n) : jacobi(m.divide2(), n);
    } else {
      return m.testBit(1) && n.testBit(1) ? -jacobi(n.mod(m), m) : jacobi(n.mod(m), m);
    }
  }

}
