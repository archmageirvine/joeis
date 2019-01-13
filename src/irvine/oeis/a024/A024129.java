package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024129.
 * @author Sean A. Irvine
 */
public class A024129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024129() {
    super(new long[] {-11, 34, -36, 14}, new long[] {1, 10, 117, 1322});
  }
}
