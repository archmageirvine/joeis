package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113772 Determinant of the 2 X 2 matrices where the first column is consecutive triangular numbers and the second column is the corresponding consecutive fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A113772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113772() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {-2, 0, -2, 5, 15, 49});
  }
}
