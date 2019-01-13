package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167477.
 * @author Sean A. Irvine
 */
public class A167477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167477() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 3, 12, 44});
  }
}
