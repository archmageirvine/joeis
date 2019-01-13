package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251706.
 * @author Sean A. Irvine
 */
public class A251706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251706() {
    super(new long[] {1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 1, 0});
  }
}
