package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227541.
 * @author Sean A. Irvine
 */
public class A227541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227541() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 13, 29});
  }
}
