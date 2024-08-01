package irvine.oeis.a215;

import irvine.oeis.FiniteSequence;

/**
 * A215797 Numbers k such that k*(k+1)/2 + 1 is a power of 2.
 * @author Georg Fischer
 */
public class A215797 extends FiniteSequence {

  /** Construct the sequence. */
  public A215797() {
    super(1, FINITE, 0, 1, 2, 5, 90);
  }
}
