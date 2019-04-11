package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037567 Decimal expansion of <code>a(n)</code> is given by the first n terms of the periodic sequence with initial period 2,2,1.
 * @author Sean A. Irvine
 */
public class A037567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037567() {
    super(new long[] {-10, 1, 0, 10}, new long[] {2, 22, 221, 2212});
  }
}
