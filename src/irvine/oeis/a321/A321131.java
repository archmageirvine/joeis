package irvine.oeis.a321;

import irvine.oeis.FiniteSequence;

/**
 * A321131 Values of m <code>(mod 25)</code>, where m <code>:= A317905(n)</code>, such that <code>a(m) = 1</code>.
 * @author Georg Fischer
 */
public class A321131 extends FiniteSequence {

  /** Construct the sequence. */
  public A321131() {
    super(2, 3, 4, 6, 8, 9, 11, 12, 13, 14, 16, 17, 19, 21, 22, 23);
  }
}
