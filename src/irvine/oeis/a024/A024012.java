package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024012 2^n - n^2.
 * @author Sean A. Irvine
 */
public class A024012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024012() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 1, 0, -1});
  }
}
