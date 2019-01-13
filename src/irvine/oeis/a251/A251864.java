package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251864.
 * @author Sean A. Irvine
 */
public class A251864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251864() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {3, 208, 4387, 240992, 5063555});
  }
}
