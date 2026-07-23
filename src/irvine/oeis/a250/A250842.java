package irvine.oeis.a250;
// manually 2026-07-23/filter at 2026-07-23 11:15

import irvine.oeis.FilterSequence;

/**
 * A250842 Primes of the form 5^x + y^5 with x, y &gt; 0.
 * @author Georg Fischer
 */
public class A250842 extends FilterSequence {

  /** Construct the sequence. */
  public A250842() {
    super(1, new A250546(), PRIME);
    next();
    next();
  }
}
