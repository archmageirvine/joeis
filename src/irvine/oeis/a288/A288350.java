package irvine.oeis.a288;

import irvine.oeis.FiniteSequence;

/**
 * A288350 Lexically smallest string of n digits from <code>1...9</code>, such that no formula using the single digits in the given order exists that evaluates to 0.
 * @author Georg Fischer
 */
public class A288350 extends FiniteSequence {

  /** Construct the sequence. */
  public A288350() {
    super(1, 12, 124, 1251, 12721, 169896, 8985898);
  }
}
