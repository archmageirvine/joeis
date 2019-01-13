package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096882.
 * @author Sean A. Irvine
 */
public class A096882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096882() {
    super(new long[] {50, 0}, new long[] {1, 7});
  }
}
