package irvine.oeis.a085;

import irvine.oeis.PartialSumSequence;

/**
 * A085188 Partial sums of A085189.
 * @author Sean A. Irvine
 */
public class A085188 extends PartialSumSequence {

  /** Construct the sequence. */
  public A085188() {
    super(0, new A085189().prepend(0));
  }
}
