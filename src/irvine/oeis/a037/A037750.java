package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037750 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period 2,3,0,1.
 * @author Sean A. Irvine
 */
public class A037750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037750() {
    super(new long[] {-10, 1, 0, 0, 10}, new long[] {2, 23, 230, 2301, 23012});
  }
}
