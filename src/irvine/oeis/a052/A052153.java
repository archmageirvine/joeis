package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052153.
 * @author Sean A. Irvine
 */
public class A052153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052153() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 9, 26, 54});
  }
}
