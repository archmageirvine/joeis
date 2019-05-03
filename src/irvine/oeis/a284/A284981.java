package irvine.oeis.a284;

import irvine.math.group.Unitary42;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284981 Number of elements of order n in the simple unitary group <code>U4(2)</code>.
 * @author Sean A. Irvine
 */
public class A284981 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A284981() {
    super(new Unitary42());
  }
}
