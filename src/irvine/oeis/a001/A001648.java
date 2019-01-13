package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001648.
 * @author Sean A. Irvine
 */
public class A001648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001648() {
    super(new long[] {-1, 0, 0, 0, 2}, new long[] {1, 3, 7, 15, 26});
  }
}
