package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180669.
 * @author Sean A. Irvine
 */
public class A180669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180669() {
    super(new long[] {-1, 2, -1, 2, -5, 4}, new long[] {0, 0, 1, 7, 26, 72});
  }
}
