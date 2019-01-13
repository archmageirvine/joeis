package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228310.
 * @author Sean A. Irvine
 */
public class A228310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228310() {
    super(new long[] {64, -48, 12}, new long[] {10, 72, 448});
  }
}
