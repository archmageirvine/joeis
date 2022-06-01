package irvine.oeis.a280;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A280058 Number of 2 X 2 matrices with entries in {0,1,...,n} with determinant = permanent with no entries repeated.
 * @author Sean A. Irvine
 */
public class A280058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280058() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 0, 12});
  }
}
