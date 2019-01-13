package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071229.
 * @author Sean A. Irvine
 */
public class A071229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071229() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 9, 38});
  }
}
