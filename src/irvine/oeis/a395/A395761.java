package irvine.oeis.a395;

import irvine.oeis.FilterNumberSequence;

/**
 * A395761 Grand-kangaroo numbers: kangaroo numbes whose inner number is itself a kangaroo number (A395720).
 * @author Sean A. Irvine
 */
public class A395761 extends FilterNumberSequence {

  private static long K = 10000;
  private static long M = 100000;

  static boolean isKangaroo(final long n) {
    final String s = String.valueOf(n);
    final long m = Long.parseLong(s.substring(1, s.length() - 1));
    return m != 0 && n % m == 0;
  }

  /** Construct the sequence. */
  public A395761() {
    super(1, 11155, k -> {
      if (k >= M) {
        K = M;
        M *= 10;
      }
      final long m = (k % K) / 10;
      return m >= 110 && k % m == 0 && isKangaroo(m);
    });
  }
}
