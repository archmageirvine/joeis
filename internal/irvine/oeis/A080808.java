package irvine.oeis;

import irvine.math.z.Z;

/**
 * Find terms of A080808 and A097661.
 *
 * @author Sean A. Irvine
 */
public final class A080808 {

  private A080808() { }

  private static final String[] TARGET = {
    "",
    "4",
    "49",
    "4096",
    "3748096",
    "4932784804069376",
    "44934932784038660743085694310776796224",
  };

  private static boolean test(final long a, final int power) {
    final String s = Z.valueOf(a).pow(power).toString();
    final String t = TARGET[power - 1];
    if (s.length() <= t.length()) {
      return false;
    }
    for (int tp = 0, sp = 0; sp < s.length(); ++sp) {
      if (s.charAt(sp) == t.charAt(tp)) {
        if (++tp == t.length()) {
          return true;
        }
      }
    }
    return false;
  }

  private static void test(final long start, final long end, final int power) {
    if (power < 2) {
      throw new IllegalArgumentException();
    }
    for (long k = start; k < end; ++k) {
      if (test(k, power)) {
        System.out.println("Bingo: " + k);
        return;
      }
    }
  }

  /**
   * Verify given numbers.
   *
   * @param args number to test
   */
  public static void main(final String[] args) {
    test(Long.parseLong(args[0]), Long.parseLong(args[1]), Integer.parseInt(args[2]));
  }
}

