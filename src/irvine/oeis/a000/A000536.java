package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A000536.
 * @author Sean A. Irvine
 */
public class A000536 implements Sequence {

  static Z k(final int n, final int j) {
    if (n < 0 || j < 0) {
      return Z.ZERO;
    }
    if (j == 0) {
      if (n == 0) {
        return Z.ONE;
      }
      return k(n - 1, 0).multiply(n).add((n & 1) == 0 ? 1 : -1);
    }
    return k(n - 1, j - 1).multiply(n).multiply(n + 1 - 2 * j)
      .add(k(n - 2, j - 1).multiply(n).multiply(n - 1))
      .divide(j);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return k(++mN, 2);
  }
}
