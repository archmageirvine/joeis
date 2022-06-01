package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103469 Number of polyominoes without holes consisting of 3 regular unit n-gons.
 * @author Sean A. Irvine
 */
public class A103469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103469() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 2, 2, 3, 2, 3, 3});
  }
}
