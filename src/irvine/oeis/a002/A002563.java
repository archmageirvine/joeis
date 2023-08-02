package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002563 Number of nonisomorphic solutions to minimal dominating set on queens' graph Q(n).
 * @author Sean A. Irvine
 */
public class A002563 extends A002564 {

  private static Z rotate90(final Z q, final int size) {
    Z r = Z.ZERO;
    Z p = Z.ONE;
    for (int y = 0; y < size; ++y) {
      for (int x = 0; x < size; ++x, p = p.multiply2()) {
        if (q.and(p).signum() != 0) {
          r = r.or(Z.ONE.shiftLeft((long) (size - x - 1) * size + y));
        }
      }
    }
    return r;
  }

  private static Z reflect(final Z q, final int size) {
    Z r = Z.ZERO;
    Z p = Z.ONE;
    for (int y = 0, yp = 0; y < size; ++y, yp += size) {
      for (int x = 0; x < size; ++x, p = p.multiply2()) {
        if (q.and(p).signum() != 0) {
          r = r.or(Z.ONE.shiftLeft(yp + size - x - 1));
        }
      }
    }
    return r;
  }

  private static boolean lt(final Z a, final Z b) {
    return a.compareTo(b) < 0;
  }

  /*
  private String dump(final Z q) {
    final StringBuilder sb = new StringBuilder();
    sb.append('+').append(StringUtils.rep('-', mBoardSize)).append("+\n");
    Z p = Z.ONE;
    for (int y = 0; y < mBoardSize; ++y) {
      sb.append('|');
      for (int x = 0; x < mBoardSize; ++x, p = p.multiply2()) {
        sb.append(q.and(p).signum() != 0 ? 'Q' : '.');
      }
      sb.append("|\n");
    }
    sb.append('+').append(StringUtils.rep('-', mBoardSize)).append("+\n");
    return sb.toString();
  }
  */

  static boolean isCounted(final Z q, final int size) {
    if (lt(reflect(q, size), q)) {
      return false;
    }
    final Z q1 = rotate90(q, size);
    if (lt(q1, q) || lt(reflect(q1, size), q)) {
      return false;
    }
    final Z q2 = rotate90(q1, size);
    if (lt(q2, q) || lt(reflect(q2, size), q)) {
      return false;
    }
    final Z q3 = rotate90(q2, size);
    if (lt(q3, q) || lt(reflect(q3, size), q)) {
      return false;
    }
    assert q.equals(rotate90(q3, size));
    return true;
  }

  @Override
  protected boolean isCounted(final Z q) {
    return isCounted(q, mBoardSize);
  }
 
}
