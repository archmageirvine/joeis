package irvine.oeis.a321;

import irvine.oeis.FiniteSequence;

/**
 * A321130 Values of m (mod 25), where A317905(m) &gt;= 2.
 * @author Georg Fischer
 */
public class A321130 extends FiniteSequence {

  /** Construct the sequence. */
  public A321130() {
    super(0, 1, 5, 7, 15, 18, 24);
  }
}
