package irvine.oeis.a284;

import irvine.math.group.Janko1;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284887.
 * @author Sean A. Irvine
 */
public class A284887 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A284887() {
    super(new Janko1());
  }
}
