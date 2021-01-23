package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103470 Number of polyominoes without holes consisting of 4 regular unit n-gons.
 * @author Sean A. Irvine
 */
public class A103470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103470() {
    super(new long[] {1, -2, 2, -2, 2, -2, 1, 0, 0, 0, 0, 0, -1, 2, -2, 2, -2, 2}, new long[] {3, 5, 7, 7, 7, 11, 14, 19, 23, 23, 23, 29, 35, 42, 48, 47, 48, 57});
  }
}
