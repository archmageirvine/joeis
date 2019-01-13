package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291412.
 * @author Sean A. Irvine
 */
public class A291412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291412() {
    super(new long[] {-1, -3, -1, 3, 3, 1}, new long[] {1, 4, 10, 24, 62, 156});
  }
}
