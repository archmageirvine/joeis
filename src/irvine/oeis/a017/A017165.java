package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017165 <code>a(n) = (9*n)^5</code>.
 * @author Sean A. Irvine
 */
public class A017165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017165() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 59049, 1889568, 14348907, 60466176, 184528125});
  }
}
