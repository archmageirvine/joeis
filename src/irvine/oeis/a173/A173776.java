package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173776 (4*10^n+41)/9.
 * @author Sean A. Irvine
 */
public class A173776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173776() {
    super(new long[] {-10, 11}, new long[] {5, 9});
  }
}
