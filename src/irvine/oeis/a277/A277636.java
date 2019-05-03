package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277636 Number of <code>3 X 3</code> matrices having all elements in <code>{0,...,n}</code> with determinant = permanent.
 * @author Sean A. Irvine
 */
public class A277636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277636() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 343, 6859, 50653, 226981, 753571, 2048383});
  }
}
