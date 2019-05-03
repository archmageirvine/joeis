package irvine.oeis.a321;

import irvine.oeis.FiniteSequence;

/**
 * A321130 Values of m <code>(mod 25)</code>, where m <code>:= A317905(n)</code>, such that <code>a(m) &gt;= 2</code>.
 * @author Georg Fischer
 */
public class A321130 extends FiniteSequence {

  /** Construct the sequence. */
  public A321130() {
    super(0, 1, 5, 7, 15, 18, 24);
  }
}
