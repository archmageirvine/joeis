package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050404 Partial sums of A051878.
 * @author Sean A. Irvine
 */
public class A050404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050404() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 14, 77, 280, 798, 1932, 4158});
  }
}
