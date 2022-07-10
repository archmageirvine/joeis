package irvine.oeis.a284;

import irvine.math.group.Unitary33;
import irvine.math.set.Permutation;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284953 Number of elements of order n in the simple unitary group U3(3).
 * @author Sean A. Irvine
 */
public class A284953 extends OrdersFiniteGroupSequence<Permutation<Integer>> {

  /** Construct the sequence. */
  public A284953() {
    super(new Unitary33());
  }
}
