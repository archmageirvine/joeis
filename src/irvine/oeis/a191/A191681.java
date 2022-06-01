package irvine.oeis.a191;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A191681 a(n) = (9^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A191681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191681() {
    super(new long[] {-9, 10}, new long[] {0, 4});
  }
}
