package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056527 Numbers where iterated sum of digits of square settles down to a cyclic pattern (in fact <code>13, 16, 13, 16, ...)</code>.
 * @author Sean A. Irvine
 */
public class A056527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056527() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 4, 5, 7, 11});
  }
}
