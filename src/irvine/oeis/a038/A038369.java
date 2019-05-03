package irvine.oeis.a038;

import irvine.oeis.FiniteSequence;

/**
 * A038369 Numbers n such that <code>n = (product</code> of digits of <code>n) * (sum</code> of digits of <code>n)</code>.
 * @author Georg Fischer
 */
public class A038369 extends FiniteSequence {

  /** Construct the sequence. */
  public A038369() {
    super(0, 1, 135, 144);
  }
}
