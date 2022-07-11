package irvine.oeis.a284;

import irvine.math.group.Janko1;
import irvine.math.set.IntegerPermutation;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284887 Number of elements of order n in the Janko group J_1.
 * @author Sean A. Irvine
 */
public class A284887 extends OrdersFiniteGroupSequence<IntegerPermutation> {

  /** Construct the sequence. */
  public A284887() {
    super(new Janko1());
  }
}
