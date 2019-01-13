package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051745.
 * @author Sean A. Irvine
 */
public class A051745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051745() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 8, 24, 60, 131, 258});
  }
}
