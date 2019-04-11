package irvine.oeis.a260;

import irvine.oeis.FiniteSequence;

/**
 * A260819 Positive integer solutions [a',b',c',d'] of the equation <code>1/a +</code> 1/b + 1/c + 1/d <code>= 1,</code> for <code>a &lt;=</code> b <code>&lt;=</code> c <code>&lt;=</code> d, lexicographically sorted.
 * @author Georg Fischer
 */
public class A260819 extends FiniteSequence {

  /** Construct the sequence. */
  public A260819() {
    super(2, 3, 7, 42, 2, 3, 8, 24, 2, 3, 9, 18, 2, 3, 10, 15, 2, 3, 12, 12, 2, 4, 5, 20, 2, 4, 6, 12, 2, 4, 8, 8, 2, 5, 5, 10, 2, 6, 6, 6, 3, 3, 4, 12, 3, 3, 6, 6, 3, 4, 4, 6, 4, 4, 4, 4);
  }
}
