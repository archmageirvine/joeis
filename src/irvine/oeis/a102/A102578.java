package irvine.oeis.a102;

import irvine.math.group.AlternatingGroup;
import irvine.math.group.IntegersMod;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A102578 <code>a(n) =</code> number of elements of order n in simple group <code>Alt(6) =</code> L_2(9) of order 360.
 * @author Sean A. Irvine
 */
public class A102578 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A102578() {
    super(new AlternatingGroup<>(new IntegersMod(6)));
  }
}
