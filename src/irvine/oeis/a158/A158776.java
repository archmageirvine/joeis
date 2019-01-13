package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158776.
 * @author Sean A. Irvine
 */
public class A158776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158776() {
    super(new long[] {1, -3, 3}, new long[] {1, 81, 321});
  }
}
