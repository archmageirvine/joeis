package irvine.oeis.a267;

import irvine.oeis.FiniteSequence;

/**
 * A267690 Numbers n such that replacing any single decimal digit d with d/3 produces a prime (obviously n can contain only digits 3, 6 or 9).
 * @author Georg Fischer
 */
public class A267690 extends FiniteSequence {

  /** Construct the sequence. */
  public A267690() {
    super(1, FINITE, 6, 9, 33, 63, 633);
  }
}
