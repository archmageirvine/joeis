package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128445.
 * @author Sean A. Irvine
 */
public class A128445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128445() {
    super(new long[] {1, -3, 3}, new long[] {20, 8, 4});
  }
}
