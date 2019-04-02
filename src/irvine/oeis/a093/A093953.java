package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093953 a(n) = rightmost term in M^n * [1,1,1], where M = a 3 X 3 matrix composed of the first 3 rows of A050166 (fill in the matrix with zeros): = [1 0 0 / 1 2 0 / 1 4 5].
 * @author Sean A. Irvine
 */
public class A093953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093953() {
    super(new long[] {10, -17, 8}, new long[] {1, 10, 63});
  }
}
