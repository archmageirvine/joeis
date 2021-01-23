package irvine.oeis.a284;

import irvine.math.group.Mathieu22;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284846 Number of elements of order n in simple Mathieu group M_22.
 * @author Sean A. Irvine
 */
public class A284846 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A284846() {
    super(new Mathieu22());
  }
}
