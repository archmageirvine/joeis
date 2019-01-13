package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110269.
 * @author Sean A. Irvine
 */
public class A110269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110269() {
    super(new long[] {1, 1, 0, -1}, new long[] {0, 2, 2, 1});
  }
}
