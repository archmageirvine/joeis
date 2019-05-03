package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084485 Number of <code>3 X n 0-1</code> matrices which have <code>n+2 1</code>'s and have no zero rows or zero columns.
 * @author Sean A. Irvine
 */
public class A084485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084485() {
    super(new long[] {-216, 540, -558, 305, -93, 15}, new long[] {1, 12, 90, 522, 2595, 11673});
  }
}
