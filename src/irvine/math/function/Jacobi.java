package irvine.math.function;

import irvine.math.z.Z;

/**
 * Jacobi function.
 * @author Sean A. Irvine
 */
class Jacobi extends AbstractFunction2 {

  @Override
  public long l(final long n, long m) {
    return i(n, m);
  }

  @Override
  public int i(final long n, long m) {
    if ((m & 1) == 0) {
      throw new ArithmeticException();
    }
    long m2 = Math.abs(m);
    long m1 = (n >= 0) ? n % m2 : (m2 - (-n % m2));
    int j = 1;

    while (true) {
      switch ((int) m1 & 15) {
        case 0:
          if (m1 == 0) {
            return m2 == 1 ? j : 0;
          }
          m1 >>>= 4;
          continue;
        case 8:
          m1 >>>= 2;
          continue;
        case 4:
          m1 >>>= 2;
          break;
        case 2:
        case 10:
          m1 >>>= 1;
          if ((m2 & 7) == 3 || (m2 & 7) == 5) {
            j = -j;
          }
          break;
        case 12:
          m1 >>>= 2;
          if ((m2 & 2) != 0) {
            j = -j;
          }
          break;
        case 3:
        case 7:
        case 11:
        case 15:
          if ((m2 & 2) != 0) {
            j = -j;
          }
          break;
        case 6:
        case 14:
          m1 >>>= 1;
          if ((m2 & 4) != 0) {
            j = -j;
          }
          break;
        default:
          break;
      }
      long m3 = ((((m2 + m1) & 3) == 0) ? m2 + m1 : m2 - m1) >>> 2;
      if (m3 >= m1) {
        m3 %= m1;
      }
      m2 = m1;
      m1 = m3;
    }
  }

  @Override
  public int i(final Z n, final Z m) {
    return n.jacobi(m);
  }

  @Override
  public Z z(final Z n, final Z m) {
    return Z.valueOf(i(n, m));
  }
}
