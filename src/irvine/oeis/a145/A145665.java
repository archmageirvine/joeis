package irvine.oeis.a145;

import irvine.math.group.Mathieu11;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A145665 <code>a(n) =</code> number of elements of order n in simple group M_11 of order 7920.
 * @author Sean A. Irvine
 */
public class A145665 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A145665() {
    super(new Mathieu11());
  }
}
