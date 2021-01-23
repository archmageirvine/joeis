package irvine.oeis.a282;

import irvine.oeis.FiniteSequence;

/**
 * A282693 Numbers n such that n = (sum of digits of n)*((sum of digits of n) + 1).
 * @author Georg Fischer
 */
public class A282693 extends FiniteSequence {

  /** Construct the sequence. */
  public A282693() {
    super(0, 12, 42, 90, 156);
  }
}
