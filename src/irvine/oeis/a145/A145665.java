package irvine.oeis.a145;

import irvine.math.group.Mathieu11;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A145665.
 * @author Sean A. Irvine
 */
public class A145665 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A145665() {
    super(new Mathieu11());
  }
}
