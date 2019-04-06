package irvine.oeis.a062;

import irvine.oeis.FiniteSequence;

/**
 * A062516 Numbers n such that tau(n)*2 = phi(n).
 * @author Georg Fischer
 */
public class A062516 extends FiniteSequence {

  /** Construct the sequence. */
  public A062516() {
    super(5, 9, 15, 28, 40, 72, 84, 90, 120);
  }
}
