package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096943.
 * @author Sean A. Irvine
 */
public class A096943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096943() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {5, 26, 81, 196, 406, 756});
  }
}
