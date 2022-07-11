package irvine.oeis.a284;

import irvine.math.group.Unitary42;
import irvine.math.set.IntegerPermutation;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284981 Number of elements of order n in the simple unitary group U4(2).
 * @author Sean A. Irvine
 */
public class A284981 extends OrdersFiniteGroupSequence<IntegerPermutation> {

  /** Construct the sequence. */
  public A284981() {
    super(new Unitary42());
  }
}
