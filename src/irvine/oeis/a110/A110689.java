package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110689.
 * @author Sean A. Irvine
 */
public class A110689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110689() {
    super(new long[] {-6, -12, -20, -17, -7}, new long[] {1, 3, -18, 63, -207});
  }
}
