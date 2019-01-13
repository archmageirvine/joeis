package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202638.
 * @author Sean A. Irvine
 */
public class A202638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202638() {
    super(new long[] {-1, 0, 16, 0}, new long[] {1, 2, 14, 31});
  }
}
