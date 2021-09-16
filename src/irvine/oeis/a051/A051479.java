package irvine.oeis.a051;

import irvine.oeis.PositionSequence;

/**
 * A051479 Values of i such that phi(n)=4i+2 has 4 solutions.
 * @author Sean A. Irvine
 */
public class A051479 extends PositionSequence {

  /** Construct the sequence. */
  public A051479() {
    super(1, new A051478(), 4);
  }
}
