package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181679.
 * @author Sean A. Irvine
 */
public class A181679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181679() {
    super(new long[] {1, -3, 3}, new long[] {123, 488, 1095});
  }
}
