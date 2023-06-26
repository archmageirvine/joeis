package irvine.oeis.a229;

import irvine.oeis.FiniteSequence;

/**
 * A229941 Sequence of triples: the 10 solutions of 1/p + 1/q + 1/r = 1/2 with 0 &lt; p &lt;= q &lt;= r, lexicographically sorted.
 * @author Georg Fischer
 */
public class A229941 extends FiniteSequence {

  /** Construct the sequence. */
  public A229941() {
    super(1, FINITE, 3, 7, 42, 3, 8, 24, 3, 9, 18, 3, 10, 15, 3, 12, 12, 4, 5, 20, 4, 6, 12, 4, 8, 8, 5, 5, 10, 6, 6, 6);
  }
}
