package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154958 Antidiagonal sums of number triangle A154957 regarded as a lower triangular infinite matrix.
 * @author Sean A. Irvine
 */
public class A154958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154958() {
    super(new long[] {-1, 1, 1, -2, 1, 1}, new long[] {1, 1, 2, 1, 2, 1});
  }
}
