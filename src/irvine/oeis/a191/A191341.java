package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191341.
 * @author Sean A. Irvine
 */
public class A191341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191341() {
    super(new long[] {8, -14, 7}, new long[] {3, 11, 51});
  }
}
