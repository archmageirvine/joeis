package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070315 Third diagonal of triangle in <code>A046739</code>.
 * @author Sean A. Irvine
 */
public class A070315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070315() {
    super(new long[] {-12, 52, -91, 82, -40, 10}, new long[] {1, 21, 161, 813, 3361, 12421});
  }
}
