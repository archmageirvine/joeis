package irvine.oeis.a230;

import irvine.oeis.FiniteSequence;

/**
 * A230400 Numbers n such that <code>n =</code> abc = 2(ab+ac+bc) for some positive integers <code>a,b</code>,c.
 * @author Georg Fischer
 */
public class A230400 extends FiniteSequence {

  /** Construct the sequence. */
  public A230400() {
    super(216, 250, 256, 288, 400, 432, 450, 486, 576, 882);
  }
}
