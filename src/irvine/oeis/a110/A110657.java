package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110657.
 * @author Sean A. Irvine
 */
public class A110657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110657() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 0, 1});
  }
}
