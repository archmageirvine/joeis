package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173806 a(n) = (7*10^n-61)/9 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A173806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173806() {
    super(new long[] {-10, 11}, new long[] {1, 71});
  }
}
