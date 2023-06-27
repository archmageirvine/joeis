package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173770 a(n)=(4*10^n-13)/9.
 * @author Sean A. Irvine
 */
public class A173770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173770() {
    super(1, new long[] {-10, 11}, new long[] {3, 43});
  }
}
