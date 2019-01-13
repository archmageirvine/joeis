package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110523.
 * @author Sean A. Irvine
 */
public class A110523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110523() {
    super(new long[] {-3, -1}, new long[] {1, 0});
  }
}
