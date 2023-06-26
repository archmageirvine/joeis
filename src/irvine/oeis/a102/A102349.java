package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102349 Numbers n such that binomial(n+1,2) is in A027568.
 * @author Georg Fischer
 */
public class A102349 extends FiniteSequence {

  /** Construct the sequence. */
  public A102349() {
    super(1, FINITE, 0, 1, 4, 15, 55, 119);
  }
}
