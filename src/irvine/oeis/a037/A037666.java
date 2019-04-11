package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037666 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period <code>3,1,0</code>.
 * @author Sean A. Irvine
 */
public class A037666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037666() {
    super(new long[] {-10, 1, 0, 10}, new long[] {3, 31, 310, 3103});
  }
}
