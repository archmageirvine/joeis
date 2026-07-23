package irvine.oeis.a250;
// manually 2026-07-23/filter at 2026-07-23 11:15

import irvine.oeis.FilterSequence;

/**
 * A250843 Primes of the form 6^x + y^6 with x, y &gt; 0.
 * @author Georg Fischer
 */
public class A250843 extends FilterSequence {

  /** Construct the sequence. */
  public A250843() {
    super(1, new A250547(), PRIME);
    next();
  }
}
