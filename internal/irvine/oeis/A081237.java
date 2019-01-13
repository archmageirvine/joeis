package irvine.oeis;

import irvine.nt.mobius.Mobius;

/**
 * Generate A081237.
 *
 * @author Sean A. Irvine
 */
public final class A081237 {

  private A081237() { }

  //  private static final long LIMIT = 3435973800L;
  private static final long LIMIT = 10000000000L;
  private static final Mobius MOBIUS = new Mobius(LIMIT);

  private static long check(final long n) {
    final int mu = MOBIUS.mobiusMu(n);
    for (long k = 1; k < n; ++k) {
      if (MOBIUS.mobiusMu(n - k) == mu && MOBIUS.mobiusMu(n + k) == mu) {
        return k;
      }
    }
    return 0;
  }

  /**
   * Verify given numbers.
   *
   * @param args number to test
   */
  public static void main(final String[] args) {
    System.out.println("Starting loop");
    for (long n = 0; n < LIMIT / 2; ++n) {
      final long k = check(n);
      if (k == 0) {
        System.out.println(String.valueOf(n));
      }
    }
  }
}

