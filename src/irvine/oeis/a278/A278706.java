package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278706.
 * @author Sean A. Irvine
 */
public class A278706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278706() {
    super(new long[] {-1, 1, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 5});
  }
}
