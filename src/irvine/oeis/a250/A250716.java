package irvine.oeis.a250;
// manually 2026-07-23/filter at 2026-07-23 11:15

import irvine.oeis.FilterSequence;

/**
 * A250716 Primes of the form 3^x + y^3 with x, y &gt;0.
 * @author Georg Fischer
 */
public class A250716 extends FilterSequence {

  /** Construct the sequence. */
  public A250716() {
    super(1, new A250483(), PRIME);
    next();
    next();
  }
}
