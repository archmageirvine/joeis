package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217776.
 * @author Sean A. Irvine
 */
public class A217776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217776() {
    super(new long[] {1, -3, 3}, new long[] {68, 100, 140});
  }
}
