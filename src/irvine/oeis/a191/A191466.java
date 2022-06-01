package irvine.oeis.a191;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A191466 9^n - 5^n.
 * @author Sean A. Irvine
 */
public class A191466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191466() {
    super(new long[] {-45, 14}, new long[] {0, 4});
  }
}
