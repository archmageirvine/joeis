package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152889 Periodic sequence <code>[1,0,4,0,0]</code> of period 5.
 * @author Sean A. Irvine
 */
public class A152889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152889() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 0, 4, 0, 0});
  }
}
