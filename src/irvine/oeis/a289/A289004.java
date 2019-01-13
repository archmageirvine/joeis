package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289004.
 * @author Sean A. Irvine
 */
public class A289004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289004() {
    super(new long[] {-1, 0, -1, 1, 0, -1, 2, 0, -1, 2}, new long[] {2, 4, 7, 11, 18, 31, 52, 89, 151, 257});
  }
}
