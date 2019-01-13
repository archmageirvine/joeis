package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253679.
 * @author Sean A. Irvine
 */
public class A253679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253679() {
    super(new long[] {-1, 4, -6, 4}, new long[] {23, 118, 333, 716});
  }
}
