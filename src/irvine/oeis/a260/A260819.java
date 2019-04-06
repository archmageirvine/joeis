package irvine.oeis.a260;

import irvine.oeis.FiniteSequence;

/**
 * A260819 Positive integer solutions [a&apos;,b&apos;,c&apos;,d&apos;] of the equation 1/a + 1/b + 1/c + 1/d = 1, for a &lt;= b &lt;= c &lt;= d, lexicographically sorted.
 * @author Georg Fischer
 */
public class A260819 extends FiniteSequence {

  /** Construct the sequence. */
  public A260819() {
    super(2, 3, 7, 42, 2, 3, 8, 24, 2, 3, 9, 18, 2, 3, 10, 15, 2, 3, 12, 12, 2, 4, 5, 20, 2, 4, 6, 12, 2, 4, 8, 8, 2, 5, 5, 10, 2, 6, 6, 6, 3, 3, 4, 12, 3, 3, 6, 6, 3, 4, 4, 6, 4, 4, 4, 4);
  }
}
