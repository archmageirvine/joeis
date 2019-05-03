package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253070 The subsequence <code>A253069(2^n-1)</code>.
 * @author Sean A. Irvine
 */
public class A253070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253070() {
    super(new long[] {8, -8, 10, -6, -1, 3, 3}, new long[] {1, 6, 22, 82, 302, 1106, 4066});
  }
}
