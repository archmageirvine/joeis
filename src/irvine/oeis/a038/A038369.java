package irvine.oeis.a038;

import irvine.oeis.FiniteSequence;

/**
 * A038369 Numbers n such that n = (product of digits of n) * (sum of digits of n).
 * @author Georg Fischer
 */
public class A038369 extends FiniteSequence {

  /** Construct the sequence. */
  public A038369() {
    super(0, 1, 135, 144);
  }
}
