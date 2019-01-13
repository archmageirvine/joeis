package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130624.
 * @author Sean A. Irvine
 */
public class A130624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130624() {
    super(new long[] {2, -3, 3}, new long[] {0, 1, 5});
  }
}
