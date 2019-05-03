package irvine.oeis.a030;

import irvine.oeis.FiniteSequence;

/**
 * A030063 Fermat's Diophantine <code>m-tuple: 1 +</code> the product of any two distinct terms is a square.
 * @author Sean A. Irvine
 */
public class A030063 extends FiniteSequence {

  /** Construct the sequence. */
  public A030063() {
    super(0, 1, 3, 8, 120);
  }
}

