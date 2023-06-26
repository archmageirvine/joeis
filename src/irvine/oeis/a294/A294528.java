package irvine.oeis.a294;

import irvine.oeis.FiniteSequence;

/**
 * A294528 a(n) is the smallest prime that begins a run of exactly n consecutive numbers having 2, 4, ..., 2*n divisors.
 * @author Georg Fischer
 */
public class A294528 extends FiniteSequence {

  /** Construct the sequence. */
  public A294528() {
    super(1, FINITE, 2, 5, 61, 421, 1524085621L);
  }
}
