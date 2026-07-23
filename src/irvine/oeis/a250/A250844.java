package irvine.oeis.a250;
// manually 2026-07-23/filter at 2026-07-23 11:15

import irvine.oeis.FilterSequence;

/**
 * A250844 Primes of the form 7^x + y^7 with x, y &gt; 0.
 * @author Georg Fischer
 */
public class A250844 extends FilterSequence {

  /** Construct the sequence. */
  public A250844() {
    super(1, new A250715(), PRIME);
    next();
    next();
  }
}
