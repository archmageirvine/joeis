package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191830.
 * @author Sean A. Irvine
 */
public class A191830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191830() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 0, 2, 1});
  }
}
