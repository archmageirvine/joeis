package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173812 (8*10^n-17)/9 for n&gt;0.
 * @author Sean A. Irvine
 */
public class A173812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173812() {
    super(new long[] {-10, 11}, new long[] {7, 87});
  }
}
