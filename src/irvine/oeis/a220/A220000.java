package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220000 Sixty fourths of an inch in thousandths, rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A220000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220000() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {16, 31, 47, 63, 78, 94, 109, 125, 141});
  }
}
