package irvine.oeis.a180;

import irvine.oeis.FiniteSequence;

/**
 * A180928 1 + product of any two terms is a triangular number.
 * @author Georg Fischer
 */
public class A180928 extends FiniteSequence {

  /** Construct the sequence. */
  public A180928() {
    super(0, 1, 5, 27);
  }
}
