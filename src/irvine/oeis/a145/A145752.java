package irvine.oeis.a145;

import irvine.math.group.AlternatingGroup;
import irvine.math.group.IntegersMod;
import irvine.math.set.Permutation;
import irvine.math.z.Z;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A145752 a(n) = number of elements of order n in simple group Alt(7) of order 2520.
 * @author Sean A. Irvine
 */
public class A145752 extends OrdersFiniteGroupSequence<Permutation<Z>> {

  /** Construct the sequence. */
  public A145752() {
    super(new AlternatingGroup<>(new IntegersMod(7)));
  }
}
