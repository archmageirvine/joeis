package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037721.
 * @author Sean A. Irvine
 */
public class A037721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037721() {
    super(new long[] {-9, 10, -10, 10}, new long[] {2, 18, 163, 1470});
  }
}
