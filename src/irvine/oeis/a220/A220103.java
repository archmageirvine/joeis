package irvine.oeis.a220;

import irvine.oeis.FiniteSequence;

/**
 * A220103 Triangular numbers that are also Jacobsthal numbers <code>(A001045)</code>.
 * @author Georg Fischer
 */
public class A220103 extends FiniteSequence {

  /** Construct the sequence. */
  public A220103() {
    super(0, 1, 3, 21, 171);
  }
}
