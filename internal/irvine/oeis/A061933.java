package irvine.oeis;

import irvine.math.z.Z;

/**
 * Verify A061933 results produced by corresponding C program.
 *
 * @author Sean A. Irvine
 */
public final class A061933 {

  private A061933() { }

  private static Z precompute(final int n) {
    // Compute total length exactly
    int c = 0;
    for (int k = 1; k <= n; ++k) {
      int x = k;
      while ((x & 3) == 0) {
        x >>= 2;
      }
      while (x != 0) {
        x >>>= 2;
        ++c;
      }
    }
    final int startCount = Z.BASE_BITS / 2;
    c *= 2;
    final int[] t = new int[(c + Z.BASE_BITS - 1) / Z.BASE_BITS];
    int tp = t.length - 1;
    int y = 0;
    int yc = c % Z.BASE_BITS;
    yc /= 2;
    if (yc == 0) {
      yc = startCount;
    }
    for (int k = 1; k <= n; ++k) {
      int x = k;
      while ((x & 3) == 0) {
        x >>= 2;
      }
      while (x != 0) {
        y <<= 2;
        y |= x & 3;
        x >>>= 2;
        if (--yc == 0) {
          t[tp--] = y;
          y = 0;
          yc = startCount;
        }
      }
    }
    return new Z(t, t.length);
  }

  /**
   * Test if a number is a member of A061933.
   *
   * @param n number to test
   * @return true if it is a member
   * @exception IllegalArgumentException if <code>n</code> is less than 1.
   */
  public static boolean test(final int n) {
    if (n <= 0) {
      throw new IllegalArgumentException();
    }
    return precompute(n).mod(n) == 0;
  }

  /**
   * Verify given numbers.
   *
   * @param args number to test
   */
  public static void main(final String[] args) {
    for (final String v : args) {
      final int n = args.length > 0 ? Integer.parseInt(v) : 0;
      System.out.println(n + " " + test(n));
    }
  }
}

