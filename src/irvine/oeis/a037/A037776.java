package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037776.
 * @author Sean A. Irvine
 */
public class A037776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037776() {
    super(new long[] {-8, 9, -9, 9}, new long[] {3, 25, 200, 1602});
  }
}
