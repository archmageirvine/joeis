package irvine.oeis.a033;

import irvine.oeis.PositionSequence;

/**
 * A033179 Numbers n such that exactly one multiset of n positive integers has equal sum and product.
 * @author Sean A. Irvine
 */
public class A033179 extends PositionSequence {

  /** Construct the sequence. */
  public A033179() {
    super(2, new A033178(), 1);
  }
}
