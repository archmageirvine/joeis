package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105638.
 * @author Sean A. Irvine
 */
public class A105638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105638() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 5, 7, 14});
  }
}
