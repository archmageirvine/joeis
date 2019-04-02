package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173810 (8*10^n-71)/9 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A173810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173810() {
    super(new long[] {-10, 11}, new long[] {1, 81});
  }
}
