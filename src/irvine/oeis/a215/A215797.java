package irvine.oeis.a215;

import irvine.oeis.FiniteSequence;

/**
 * A215797 Numbers n such that n(n+1)/2 + 1 is a power of 2.
 * @author Georg Fischer
 */
public class A215797 extends FiniteSequence {

  /** Construct the sequence. */
  public A215797() {
    super(0, 1, 2, 5, 90);
  }
}
