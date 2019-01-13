package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105384.
 * @author Sean A. Irvine
 */
public class A105384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105384() {
    super(new long[] {-1, -1, -1, -1}, new long[] {0, 1, -1, 0});
  }
}
