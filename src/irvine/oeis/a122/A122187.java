package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122187 First row sum of the matrix M^n, where M is the 3 X 3 matrix [[6, 5, 3], [5, 4, 2], [3, 2, 1]] (n&gt;=0).
 * @author Sean A. Irvine
 */
public class A122187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122187() {
    super(1, new long[] {-1, 4, 11}, new long[] {1, 14, 157});
  }
}
