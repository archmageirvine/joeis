package irvine.oeis.a279;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A279043 Numbers k such that 3*k+1 and 4*k+1 are both triangular numbers (A000217).
 * @author Sean A. Irvine
 */
public class A279043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279043() {
    super(new long[] {1, -195, 195}, new long[] {63, 12285, 2383290});
  }
}
