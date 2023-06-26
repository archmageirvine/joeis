package irvine.oeis.a282;

import irvine.oeis.FiniteSequence;

/**
 * A282693 Numbers k such that k = (sum of digits of k)*((sum of digits of k) + 1).
 * @author Georg Fischer
 */
public class A282693 extends FiniteSequence {

  /** Construct the sequence. */
  public A282693() {
    super(1, FINITE, 0, 12, 42, 90, 156);
  }
}
