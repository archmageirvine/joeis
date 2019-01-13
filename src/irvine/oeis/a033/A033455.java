package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033455.
 * @author Sean A. Irvine
 */
public class A033455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033455() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 8, 34, 104, 259, 560});
  }
}
