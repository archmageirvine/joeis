package irvine.oeis.a144;

import irvine.oeis.FiniteSequence;

/**
 * A144046 Numbers n such that <code>|n!-107|</code> and <code>|n!+107|</code> are prime.
 * @author Georg Fischer
 */
public class A144046 extends FiniteSequence {

  /** Construct the sequence. */
  public A144046() {
    super(3, 4, 5, 6, 7, 8, 80);
  }
}
