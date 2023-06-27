package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173768 a(n) = (4*10^n-31)/9.
 * @author Sean A. Irvine
 */
public class A173768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173768() {
    super(1, new long[] {-10, 11}, new long[] {1, 41});
  }
}
