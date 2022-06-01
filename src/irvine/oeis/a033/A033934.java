package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033934 (10^n+1)^2.
 * @author Sean A. Irvine
 */
public class A033934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033934() {
    super(new long[] {1000, -1110, 111}, new long[] {4, 121, 10201});
  }
}
