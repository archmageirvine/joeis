package irvine.oeis.a284;

import irvine.math.group.Suzuki8;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284430 Number of elements of order n in the Suzuki group Sz(8).
 * @author Sean A. Irvine
 */
public class A284430 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A284430() {
    super(new Suzuki8());
  }
}
