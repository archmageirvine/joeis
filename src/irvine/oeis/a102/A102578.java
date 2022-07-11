package irvine.oeis.a102;

import irvine.math.group.AlternatingGroup;
import irvine.math.group.IntegersMod;
import irvine.math.set.Permutation;
import irvine.math.z.Z;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A102578 a(n) = number of elements of order n in simple group Alt(6) = L_2(9) of order 360.
 * @author Sean A. Irvine
 */
public class A102578 extends OrdersFiniteGroupSequence<Permutation<Z>> {

  /** Construct the sequence. */
  public A102578() {
    super(new AlternatingGroup<>(new IntegersMod(6)));
  }
}
