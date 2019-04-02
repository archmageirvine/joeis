package irvine.oeis.a284;

import irvine.math.group.Unitary34;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284960 Number of elements of order n in the simple unitary group U3(4).
 * @author Sean A. Irvine
 */
public class A284960 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A284960() {
    super(new Unitary34());
  }
}
