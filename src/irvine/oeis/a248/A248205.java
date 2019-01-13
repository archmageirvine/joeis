package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248205.
 * @author Sean A. Irvine
 */
public class A248205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248205() {
    super(new long[] {1, -99, 99}, new long[] {1, 50, 4851});
  }
}
