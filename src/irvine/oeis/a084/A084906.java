package irvine.oeis.a084;

import irvine.oeis.FilterPositionSequence;

/**
 * A084906 Numbers with at least one place in their decimal representation to insert a division operator such that an integer results.
 * @author Sean A. Irvine
 */
public class A084906 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A084906() {
    super(1, 0, new A084904(), NONZERO);
  }
}
