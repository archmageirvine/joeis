package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048913.
 * @author Sean A. Irvine
 */
public class A048913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048913() {
    super(new long[] {1, -1, -12098, 12098, 1}, new long[] {1, 14, 7189, 165026, 86968201});
  }
}
