package irvine.oeis.a322;

import irvine.oeis.FiniteSequence;

/**
 * A322271 Smallest multiplication factors f, prime or 1, for all b (mod 24), coprime to 24, so that b*f is a nonzero square mod 8 and mod 3.
 * @author Georg Fischer
 */
public class A322271 extends FiniteSequence {

  /** Construct the sequence. */
  public A322271() {
    super(1, FINITE, 1, 5, 7, 11, 13, 17, 19, 23);
  }
}
