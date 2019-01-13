package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080857.
 * @author Sean A. Irvine
 */
public class A080857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080857() {
    super(new long[] {1, -3, 3}, new long[] {1, 6, 36});
  }
}
