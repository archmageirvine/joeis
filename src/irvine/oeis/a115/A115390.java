package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115390 Binomial transform of tribonacci sequence A000073.
 * @author Sean A. Irvine
 */
public class A115390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115390() {
    super(new long[] {2, -4, 4}, new long[] {0, 0, 1});
  }
}
