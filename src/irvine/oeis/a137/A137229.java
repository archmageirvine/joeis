package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137229 Transform of A000217 without the initial 0 by the T_{0,0} transformation (see link).
 * @author Sean A. Irvine
 */
public class A137229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137229() {
    super(new long[] {-1, 3, -5, 4}, new long[] {1, 4, 11, 27});
  }
}
