package irvine.oeis.a322;

import irvine.oeis.FiniteSequence;

/**
 * A322272 Smallest multiplication factors f, prime or 1, for all a (mod 120), coprime to 120, so that b*f is a nonzero square mod 8, mod 3, and mod 5.
 * @author Georg Fischer
 */
public class A322272 extends FiniteSequence {

  /** Construct the sequence. */
  public A322272() {
    super(1, 7, 11, 13, 17, 19, 23, 29, 31, 13, 41, 43, 23, 1, 53, 11, 61, 43, 71, 73, 53, 31, 83, 41, 19, 73, 29, 7, 83, 61, 17, 71);
  }
}
