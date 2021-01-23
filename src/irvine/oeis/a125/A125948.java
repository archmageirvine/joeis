package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125948 a(n) is the number of nonnegative integers k less than 10^n such that the decimal representation of k lacks at least one of digits 1,2,3, at least one of digits 4,5,6 and at least one of digits 7,8,9.
 * @author Sean A. Irvine
 */
public class A125948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125948() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {10, 100, 982, 9388, 86950, 778780, 6748822});
  }
}
