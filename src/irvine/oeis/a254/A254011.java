package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254011.
 * @author Sean A. Irvine
 */
public class A254011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254011() {
    super(new long[] {-1, 0, 0, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 0, 0, 1, 1, 0});
  }
}
