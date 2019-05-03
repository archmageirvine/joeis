package irvine.oeis.a038;

import irvine.oeis.FiniteSequence;

/**
 * A038364 Numbers n such that <code>n = (product</code> of digits of <code>n) + (sum</code> of digits of <code>n)</code>.
 * @author Georg Fischer
 */
public class A038364 extends FiniteSequence {

  /** Construct the sequence. */
  public A038364() {
    super(0, 19, 29, 39, 49, 59, 69, 79, 89, 99);
  }
}
