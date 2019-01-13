package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228887.
 * @author Sean A. Irvine
 */
public class A228887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228887() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 35, 120, 286});
  }
}
