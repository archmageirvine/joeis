package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251710.
 * @author Sean A. Irvine
 */
public class A251710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251710() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 1, 0});
  }
}
