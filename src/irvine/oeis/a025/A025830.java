package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025830.
 * @author Sean A. Irvine
 */
public class A025830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025830() {
    super(new long[] {1, 0, 0, -1, -1, 0, 0, 1, -1, 0, 0, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 0, 1, 1, 2, 1, 1, 2, 3, 1, 2});
  }
}
