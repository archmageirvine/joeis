package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225232 The number of <code>FO3C2</code> moves required to restore a packet of n playing cards to its original state (order and <code>orientation)</code>.
 * @author Sean A. Irvine
 */
public class A225232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225232() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {2, 4, 4, 12, 6, 24});
  }
}
