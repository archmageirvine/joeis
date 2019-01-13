package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110513.
 * @author Sean A. Irvine
 */
public class A110513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110513() {
    super(new long[] {-1, 0, -2}, new long[] {1, -1, 2});
  }
}
