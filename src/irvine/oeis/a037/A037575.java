package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037575 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period <code>2,1,2</code>.
 * @author Sean A. Irvine
 */
public class A037575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037575() {
    super(new long[] {-10, 1, 0, 10}, new long[] {2, 21, 212, 2122});
  }
}
