package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277636 Number of 3 X 3 matrices having all elements in {0,...,n} with determinant = permanent.
 * @author Sean A. Irvine
 */
public class A277636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277636() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 343, 6859, 50653, 226981, 753571, 2048383});
  }
}
