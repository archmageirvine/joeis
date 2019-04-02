package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051737 Number of 4 X n (0,1)-matrices with no consecutive 1's in any row or column.
 * @author Sean A. Irvine
 */
public class A051737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051737() {
    super(new long[] {1, -4, -5, 9, 4}, new long[] {1, 8, 41, 227, 1234});
  }
}
