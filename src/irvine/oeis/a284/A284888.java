package irvine.oeis.a284;

import irvine.math.group.Janko2;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284888 Number of elements of order n in the Janko group <code>J_2</code>.
 * @author Sean A. Irvine
 */
public class A284888 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A284888() {
    super(new Janko2());
  }
}
