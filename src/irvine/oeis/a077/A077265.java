package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077265.
 * @author Sean A. Irvine
 */
public class A077265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077265() {
    super(new long[] {-2, 7, -9, 5}, new long[] {14, 28, 52, 94});
  }
}
