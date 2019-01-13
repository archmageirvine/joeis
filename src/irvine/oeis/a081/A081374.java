package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081374.
 * @author Sean A. Irvine
 */
public class A081374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081374() {
    super(new long[] {2, -1, 0, 2}, new long[] {1, 2, 2, 5});
  }
}
