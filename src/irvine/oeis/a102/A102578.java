package irvine.oeis.a102;

import irvine.math.group.AlternatingGroup;
import irvine.math.group.IntegersMod;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A102578.
 * @author Sean A. Irvine
 */
public class A102578 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A102578() {
    super(new AlternatingGroup<>(new IntegersMod(6)));
  }
}
