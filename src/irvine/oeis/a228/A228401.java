package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228401.
 * @author Sean A. Irvine
 */
public class A228401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228401() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 2, 6, 24, 120, 540, 1996, 6196, 16732});
  }
}
