package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158643.
 * @author Sean A. Irvine
 */
public class A158643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158643() {
    super(new long[] {1, -3, 3}, new long[] {26, 702, 2730});
  }
}
