package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102772 Numbers n such that binomial(n,3) is in A027568.
 * @author Georg Fischer
 */
public class A102772 extends FiniteSequence {

  /** Construct the sequence. */
  public A102772() {
    super(1, 3, 5, 10, 22, 36);
  }
}
