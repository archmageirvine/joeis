package irvine.oeis.a037;

import irvine.oeis.FiniteSequence;

/**
 * A037230 Numbers n such that phi(n) &lt; pi(n).
 * @author Georg Fischer
 */
public class A037230 extends FiniteSequence {

  /** Construct the sequence. */
  public A037230() {
    super(1, FINITE, 6, 12, 18, 24, 30, 42, 60);
  }
}
