package irvine.oeis.a284;

import irvine.math.group.Janko2;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A284888.
 * @author Sean A. Irvine
 */
public class A284888 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A284888() {
    super(new Janko2());
  }
}
