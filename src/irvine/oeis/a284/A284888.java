package irvine.oeis.a284;

import irvine.math.group.Janko2;
import irvine.math.set.IntegerPermutation;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284888 Number of elements of order n in the Janko group J_2.
 * @author Sean A. Irvine
 */
public class A284888 extends OrdersFiniteGroupSequence<IntegerPermutation> {

  /** Construct the sequence. */
  public A284888() {
    super(new Janko2());
  }
}
