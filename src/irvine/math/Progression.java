package irvine.math;

/**
 * Tests for various kinds of numerical progression.
 *
 * @author Sean A. Irvine
 */
public final class Progression {

  private Progression() { }

  /**
   * Test if the given integer array contains integers forming
   * an arithmetic progression.  That is, tests if there is a
   * constant difference between terms.  Sequences of length
   * less than 3 or that are null always return false.
   *
   * @param x array to test
   * @return true if the entries form an arithmetic progression
   */
  public static boolean isArithmeticProgression(final int[] x) {
    if (x != null && x.length >= 3) {
      final int d = x[1] - x[0];
      for (int i = 2; i < x.length; ++i) {
        if (x[i] - x[i - 1] != d) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  /**
   * Test if the given integer array contains integers forming
   * a geometric progression.  That is, tests if there is a
   * constant ratio between terms.  Sequences of length
   * less than 3 or that are null always return false.  The
   * all zero sequence returns true, even though the ratio
   * between all terms in not well-defined.
   *
   * @param x array to test
   * @return true if the entries form an arithmetic progression
   */
  public static boolean isGeometricProgression(final int[] x) {
    if (x != null && x.length >= 3) {
      final double r = x[1] / (double) x[0];
      for (int i = 2; i < x.length; ++i) {
        if (x[i] != (int) (r * x[i - 1] + 0.5)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  /**
   * Test if every member is odd.
   *
   * @param x array to test
   * @return true if all members of x are odd
   */
  public static boolean isOdd(final int[] x) {
    if (x != null) {
      for (final int v : x) {
        if ((v & 1) == 0) {
          return false;
        }
      }
      return true;
    }
    return false;
  }

  /**
   * Test if every member is even.
   *
   * @param x array to test
   * @return true if all members of x are even
   */
  public static boolean isEven(final int[] x) {
    if (x != null) {
      for (final int v : x) {
        if ((v & 1) == 1) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
}
