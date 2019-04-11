package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037617 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period <code>1,3,2</code>.
 * @author Sean A. Irvine
 */
public class A037617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037617() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 13, 132, 1321});
  }
}
