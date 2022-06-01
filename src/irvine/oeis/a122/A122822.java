package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122822 The (1,4) entry in the matrix M^n, where M is the 4 X 4 matrix [[0,-1,1,0],[0,0,-1,1],[1,1,1,0],[0,1,1,1]].
 * @author Sean A. Irvine
 */
public class A122822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122822() {
    super(new long[] {-3, 1, 0, 2}, new long[] {0, 0, -1, 0});
  }
}
