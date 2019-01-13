package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191012.
 * @author Sean A. Irvine
 */
public class A191012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191012() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 22, 183, 820, 2605});
  }
}
