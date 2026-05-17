package irvine.oeis.a395;

import irvine.oeis.FilterNumberSequence;

/**
 * A395720 Kangaroo numbers are numbers that are multiples of their inner number; that is, the number obtained by removing its first and last digits.
 * @author Sean A. Irvine
 */
public class A395720 extends FilterNumberSequence {

  private static long sK = 100;
  private static long sM = 1000;

  /** Construct the sequence. */
  public A395720() {
    super(1, 110, k -> {
      if (k >= sM) {
        sK = sM;
        sM *= 10;
      }
      final long m = (k % sK) / 10;
      return m != 0 && k % m == 0;
    });
  }
}
