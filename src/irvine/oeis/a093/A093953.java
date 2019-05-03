package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093953 <code>a(n) =</code> rightmost term in <code>M^n * [1,1,1]</code>, where M <code>= a 3 X 3</code> matrix composed of the first 3 rows of <code>A050166 (fill</code> in the matrix with <code>zeros): = [1 0 0 / 1 2 0 / 1 4 5]</code>.
 * @author Sean A. Irvine
 */
public class A093953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093953() {
    super(new long[] {10, -17, 8}, new long[] {1, 10, 63});
  }
}
