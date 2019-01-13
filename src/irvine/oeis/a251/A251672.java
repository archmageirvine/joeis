package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251672.
 * @author Sean A. Irvine
 */
public class A251672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251672() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 1, 0});
  }
}
