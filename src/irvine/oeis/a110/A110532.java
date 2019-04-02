package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110532 a(n) = floor(n/2) + floor(n/5).
 * @author Sean A. Irvine
 */
public class A110532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110532() {
    super(new long[] {-1, 0, 1, 0, 0, 1, 0}, new long[] {0, 0, 1, 1, 2, 3, 4});
  }
}
