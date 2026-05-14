package irvine.oeis.a395;

import irvine.oeis.FilterNumberSequence;

/**
 * A395720 allocated for Carole Dubois.
 * @author Sean A. Irvine
 */
public class A395720 extends FilterNumberSequence {

  private static long K = 100;
  private static long M = 1000;

  /** Construct the sequence. */
  public A395720() {
    super(1, 110, k -> {
      if (k >= M) {
        K = M;
        M *= 10;
      }
      final long m = (k % K) / 10;
      return m != 0 && k % m == 0;
    });
  }
}
