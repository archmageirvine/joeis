package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178876 a(n) = number of 7-digit primes with digit sum n, where n runs through the non-multiples of 3 in the range [2..62].
 * @author Georg Fischer
 */
public class A178876 extends FiniteSequence {

  /** Construct the sequence. */
  public A178876() {
    super(1, FINITE, 0, 5, 21, 95, 138, 420, 773, 1747, 2329, 4616, 6456, 10496, 12743, 18710, 22447, 29209, 32075, 38631, 41150, 44442, 44915, 44025, 42891, 37872, 35177, 28462, 24722, 18033, 15169, 9903, 7611, 4220, 3227, 1599, 959, 387, 283, 87, 31, 4, 1);
  }
}
