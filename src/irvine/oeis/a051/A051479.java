package irvine.oeis.a051;

import irvine.oeis.FilterPositionSequence;

/**
 * A051479 Values of i such that phi(x) = 4i+2 has 4 solutions.
 * @author Sean A. Irvine
 */
public class A051479 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A051479() {
    super(1, new A051478(), 4);
  }
}
