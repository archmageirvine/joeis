package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048905.
 * @author Sean A. Irvine
 */
public class A048905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048905() {
    super(new long[] {1, -483, 483}, new long[] {1, 315, 151669});
  }
}
