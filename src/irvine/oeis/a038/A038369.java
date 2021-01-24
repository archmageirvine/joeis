package irvine.oeis.a038;

import irvine.oeis.FiniteSequence;

/**
 * A038369 Numbers k such that k = (product of digits of k) * (sum of digits of k).
 * @author Georg Fischer
 */
public class A038369 extends FiniteSequence {

  /** Construct the sequence. */
  public A038369() {
    super(0, 1, 135, 144);
  }
}
