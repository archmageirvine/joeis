package irvine.oeis.a323;

import irvine.oeis.FiniteSequence;

/**
 * A323383 Positive integers k such that tau(k) &gt;= k/2.
 * @author Georg Fischer
 */
public class A323383 extends FiniteSequence {

  /** Construct the sequence. */
  public A323383() {
    super(1, FINITE, 1, 2, 3, 4, 6, 8, 12);
  }
}
