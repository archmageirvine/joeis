package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037559 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period 2,1,1.
 * @author Sean A. Irvine
 */
public class A037559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037559() {
    super(new long[] {-10, 1, 0, 10}, new long[] {2, 21, 211, 2112});
  }
}
