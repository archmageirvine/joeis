package irvine.oeis.a284;

import irvine.math.group.Mathieu12;
import irvine.math.set.Permutation;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284842 Number of elements of order n in simple Mathieu group M_12.
 * @author Sean A. Irvine
 */
public class A284842 extends OrdersFiniteGroupSequence<Permutation<Integer>> {

  /** Construct the sequence. */
  public A284842() {
    super(new Mathieu12());
  }
}
