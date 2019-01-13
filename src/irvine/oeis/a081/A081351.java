package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081351.
 * @author Sean A. Irvine
 */
public class A081351 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081351() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 8, 9, 24, 25});
  }
}
