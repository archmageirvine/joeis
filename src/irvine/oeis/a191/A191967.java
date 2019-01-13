package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191967.
 * @author Sean A. Irvine
 */
public class A191967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191967() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 4, 12, 20});
  }
}
