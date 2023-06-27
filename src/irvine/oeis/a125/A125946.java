package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125946 a(n) is the number of nonnegative integers k less than 10^n such that the decimal representation of k lacks at least one of digits 1,2, at least one of digits 3,4,5 and at least one of digits 6,7,8,9.
 * @author Sean A. Irvine
 */
public class A125946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125946() {
    super(1, new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {10, 98, 940, 8798, 80140, 709238, 6096100});
  }
}
