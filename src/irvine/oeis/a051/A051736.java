package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051736 Number of 3 X <code>n (0</code>,1)-matrices with no consecutive 1's in <code>any</code> row or column.
 * @author Sean A. Irvine
 */
public class A051736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051736() {
    super(new long[] {-1, 0, 6, 2}, new long[] {1, 5, 17, 63});
  }
}
