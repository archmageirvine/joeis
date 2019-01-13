package irvine.math;

/**
 * Population count function.
 *
 * @author Sean A. Irvine
 */
public final class PopCount {

  private PopCount() { }

  /**
   * Population count.  Returns the number of 1-bits in <code>x</code>.
   *
   * @param x value to get population count of
   * @return population count
   */
  public static int popcount(int x) {
    x -= (x >>> 1) & 0x55555555;
    x = (x & 0x33333333) + ((x >>> 2) & 0x33333333);
    x += x >>> 4;
    x &= 0x0F0F0F0F;
    x += x >>> 8;
    x += x >>> 16;
    return x & 0x3F;
  }

  /**
   * Population count.  Returns the number of 1-bits in <code>x</code>.
   *
   * @param x value to get population count of
   * @return population count
   */
  public static long popcount(long x) {
    x -= (x >>> 1) & 0x5555555555555555L;
    x = (x & 0x3333333333333333L) + ((x >>> 2) & 0x3333333333333333L);
    x += x >>> 4;
    x &= 0x0F0F0F0F0F0F0F0FL;
    x += x >>> 8;
    x += x >>> 16;
    x += x >>> 32;
    return x & 0x7F;
  }
}
