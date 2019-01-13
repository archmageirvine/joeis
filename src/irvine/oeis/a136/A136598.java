package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136598.
 * @author Sean A. Irvine
 */
public class A136598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136598() {
    super(new long[] {1, 0, -1, 0, 0}, new long[] {5, 0, 0, -3, 0});
  }
}
