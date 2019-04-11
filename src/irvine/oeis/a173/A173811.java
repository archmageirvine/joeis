package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173811 <code>(8*10^n-53)/9</code> for <code>n&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A173811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173811() {
    super(new long[] {-10, 11}, new long[] {3, 83});
  }
}
