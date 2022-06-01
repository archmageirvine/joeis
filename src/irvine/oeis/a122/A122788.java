package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122788 (1,3)-entry of the 3 X 3 matrix M^n, where M = {{0, -1, 1}, {1, 1, 0}, {0, 1, 1}}.
 * @author Sean A. Irvine
 */
public class A122788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122788() {
    super(new long[] {2, -2, 2}, new long[] {0, 1, 1});
  }
}
