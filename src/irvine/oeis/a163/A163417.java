package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163417.
 * @author Sean A. Irvine
 */
public class A163417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163417() {
    super(new long[] {-2, 6, -5, -1, 3}, new long[] {1, 0, -1, -4, -6});
  }
}
