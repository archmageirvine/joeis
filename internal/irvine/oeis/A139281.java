package irvine.oeis;

/**
 * Generate A139281.
 *
 * @author Sean A. Irvine
 */
public final class A139281 {

  private A139281() { }

  private static long compute(long n) {
    if (n == 0) {
      return 0;
    }
    final long[] m = new long[3];
    final int[] count = new int[3];
    while (n != 0) {
      long d = n % 10;
      final int r = (int) d % 3;
      for (int k = 0; k < count[r]; ++k) {
        d *= 10;
      }
      m[r] += d;
      count[r]++;
      n /= 10;
    }
    long q = 1;
    int c = 0;
    for (int k = 0; k < m.length; ++k) {
      if (count[k] != 0) {
        ++c;
        q *= m[k];
      }
    }
    if (c < 2) {
      return q;
    }
    return compute(q);
  }

  /**
   * Verify given numbers.
   *
   * @param args number to test
   */
  public static void main(final String[] args) {
    for (int k = 0; k < 150; ++k) {
      System.out.println(String.valueOf(compute(k)));
    }
  }
}

