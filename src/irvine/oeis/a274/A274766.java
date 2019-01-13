package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274766.
 * @author Sean A. Irvine
 */
public class A274766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274766() {
    super(new long[] {1000, -1110, 111}, new long[] {0, 11, 1221});
  }
}
