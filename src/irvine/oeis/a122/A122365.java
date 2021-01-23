package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122365 The (1,6)-entry of the matrix M^n, where M is the 6 X 6 matrix {{1, 1, 1, 1, 1, 1},{1, 0, 0, 0, 1, 0},{1, 0, 0, 1, 0, 0},{1, 0, 1, 0, 0, 0},{1, 1, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0}}.
 * @author Sean A. Irvine
 */
public class A122365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122365() {
    super(new long[] {-1, 4, 2}, new long[] {0, 1, 1});
  }
}
