package irvine.oeis.a284;

import irvine.math.group.Mathieu12;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284842.
 * @author Sean A. Irvine
 */
public class A284842 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A284842() {
    super(new Mathieu12());
  }
}
