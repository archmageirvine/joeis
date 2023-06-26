package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178605 a(n) = number of 6-digit primes with digit sum n, where n runs through the non-multiples of 3 in the range [2..53].
 * @author Georg Fischer
 */
public class A178605 extends FiniteSequence {

  /** Construct the sequence. */
  public A178605() {
    super(1, FINITE, 0, 2, 14, 58, 76, 204, 389, 660, 852, 1448, 1971, 2832, 3101, 4064, 4651, 5393, 5376, 5570, 5785, 5287, 4796, 3975, 3671, 2687, 2080, 1405, 1135, 630, 405, 178, 140, 51, 16, 3, 1);
  }
}
