package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251733.
 * @author Sean A. Irvine
 */
public class A251733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251733() {
    super(new long[] {9, -6}, new long[] {0, 3});
  }
}
