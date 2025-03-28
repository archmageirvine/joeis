package irvine.oeis.a374;
// Generated by gen_seq4.pl 2025-02-10.ack/filtpos at 2025-02-10 21:26

import irvine.oeis.FilterPositionSequence;

/**
 * A374473 Numbers k such that bigomega(k) and A064547(k) are not both even, where A064547 is the count of 1-bits in the exponents of the prime factorization of n, and bigomega is the number of prime factors of n (with multiplicity).
 * @author Georg Fischer
 */
public class A374473 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A374473() {
    super(1, 1, new A374471(), v -> !v.testBit(0));
  }
}
