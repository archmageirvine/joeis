package irvine.oeis.a284;

import irvine.math.group.Unitary35;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284961 Number of elements of order n in the simple unitary group <code>U3(5)</code>.
 * @author Sean A. Irvine
 */
public class A284961 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A284961() {
    super(new Unitary35());
  }
}
