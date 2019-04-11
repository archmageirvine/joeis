package irvine.oeis.a290;

import irvine.oeis.FiniteSequence;

/**
 * A290388 Increasing sequence where <code>a(n)</code> is the smallest integer not yet in the sequence with no digits shared with the terms <code>a(n-1)</code> and <code>a(n-2),</code> no repeated digits, and no 0-digit allowed.
 * @author Georg Fischer
 */
public class A290388 extends FiniteSequence {

  /** Construct the sequence. */
  public A290388() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 34, 56, 71, 82, 93, 145, 267, 389, 415, 627, 839);
  }
}
