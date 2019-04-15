package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102461 Numbers n such that <code>binomial(n,2)</code> is in A027568.
 * @author Georg Fischer
 */
public class A102461 extends FiniteSequence {

  /** Construct the sequence. */
  public A102461() {
    super(1, 2, 5, 16, 56, 120);
  }
}
