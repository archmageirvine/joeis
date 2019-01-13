package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228078.
 * @author Sean A. Irvine
 */
public class A228078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228078() {
    super(new long[] {2, -1, -4, 4}, new long[] {0, 0, 2, 5});
  }
}
