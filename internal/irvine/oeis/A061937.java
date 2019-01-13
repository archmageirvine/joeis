package irvine.oeis;

import irvine.math.z.Z;

/**
 * Verify A061937 results produced by corresponding C program.
 *
 * @author Sean A. Irvine
 */
public final class A061937 {

  private A061937() { }

  private static Z precompute(final int n) {
    // Compute total length exactly
    int c = 0;
    for (int k = 1; k <= n; ++k) {
      int x = k;
      while ((x & 7) == 0) {
        x >>= 3;
      }
      while (x != 0) {
        x >>>= 3;
        ++c;
      }
    }
    final int startCount = Z.BASE_BITS / 3;
    c *= 3;
    final int[] t = new int[(c + Z.BASE_BITS - 1) / Z.BASE_BITS];
    int tp = t.length - 1;
    int y = 0;
    int yc = c % Z.BASE_BITS;
    yc /= 3;
    if (yc == 0) {
      yc = startCount;
    }
    for (int k = 1; k <= n; ++k) {
      int x = k;
      while ((x & 7) == 0) {
        x >>= 3;
      }
      while (x != 0) {
        y <<= 3;
        y |= x & 7;
        x >>>= 3;
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
   * Test if a number is a member of A061937.
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

