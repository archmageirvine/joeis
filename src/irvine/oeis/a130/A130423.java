package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130423.
 * @author Sean A. Irvine
 */
public class A130423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130423() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 14, 39, 88});
  }
}
