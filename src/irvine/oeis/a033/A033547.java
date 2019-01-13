package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033547.
 * @author Sean A. Irvine
 */
public class A033547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033547() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 2, 6, 14});
  }
}
