package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220442.
 * @author Sean A. Irvine
 */
public class A220442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220442() {
    super(new long[] {-1944, 1350, -315, 30}, new long[] {4, 30, 270, 2700});
  }
}
