package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254229.
 * @author Sean A. Irvine
 */
public class A254229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254229() {
    super(new long[] {1, -1, -322, 322, 1}, new long[] {1, 46, 207, 14652, 66493});
  }
}
