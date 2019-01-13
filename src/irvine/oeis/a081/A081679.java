package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081679.
 * @author Sean A. Irvine
 */
public class A081679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081679() {
    super(new long[] {720, -1044, 580, -155, 20}, new long[] {1, 1, 1, 16, 199});
  }
}
