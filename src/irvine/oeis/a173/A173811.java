package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173811 a(n) = (8*10^n - 53)/9 for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A173811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173811() {
    super(1, new long[] {-10, 11}, new long[] {3, 83});
  }
}
