package irvine.oeis.a191;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A191759 Least significant decimal digit of (2n-1)^2.
 * @author Sean A. Irvine
 */
public class A191759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191759() {
    super(1, new long[] {1, 0, 0, 0, 0}, new long[] {1, 9, 5, 9, 1});
  }
}
