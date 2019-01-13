package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184549.
 * @author Sean A. Irvine
 */
public class A184549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184549() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 6, 17, 23, 28});
  }
}
