package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051736 Number of <code>3 X n (0,1)-matrices</code> with no consecutive <code>1</code>'s in any row or column.
 * @author Sean A. Irvine
 */
public class A051736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051736() {
    super(new long[] {-1, 0, 6, 2}, new long[] {1, 5, 17, 63});
  }
}
