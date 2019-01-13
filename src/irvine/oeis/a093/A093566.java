package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093566.
 * @author Sean A. Irvine
 */
public class A093566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093566() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 0, 1, 20, 120});
  }
}
