package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102002 Weighted tribonacci (1,2,4), companion to A102001.
 * @author Sean A. Irvine
 */
public class A102002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102002() {
    super(1, new long[] {4, 2, 1}, new long[] {1, 7, 13});
  }
}
