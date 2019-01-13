package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033183.
 * @author Sean A. Irvine
 */
public class A033183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033183() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1});
  }
}
