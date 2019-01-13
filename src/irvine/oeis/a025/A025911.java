package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025911.
 * @author Sean A. Irvine
 */
public class A025911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025911() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 2, 0, 1});
  }
}
