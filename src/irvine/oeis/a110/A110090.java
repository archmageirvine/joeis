package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110090.
 * @author Sean A. Irvine
 */
public class A110090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110090() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 2, 2, 1, 4});
  }
}
