package irvine.oeis.a282;

import irvine.oeis.FiniteSequence;

/**
 * A282693 Numbers n such that <code>n =</code> (sum of digits of <code>n)*((sum</code> of digits of <code>n) + 1)</code>.
 * @author Georg Fischer
 */
public class A282693 extends FiniteSequence {

  /** Construct the sequence. */
  public A282693() {
    super(0, 12, 42, 90, 156);
  }
}
