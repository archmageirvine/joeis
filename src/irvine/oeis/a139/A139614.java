package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139614.
 * @author Sean A. Irvine
 */
public class A139614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139614() {
    super(new long[] {-1, 2}, new long[] {14, 105});
  }
}
