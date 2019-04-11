package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102002 Weighted tribonacci <code>(1,2,4),</code> companion to A102001.
 * @author Sean A. Irvine
 */
public class A102002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102002() {
    super(new long[] {4, 2, 1}, new long[] {1, 7, 13});
  }
}
