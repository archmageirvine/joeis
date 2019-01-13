package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034857.
 * @author Sean A. Irvine
 */
public class A034857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034857() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, 6, 18, 36});
  }
}
