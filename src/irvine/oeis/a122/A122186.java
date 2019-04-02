package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122186 First row sum of the 4 X 4 matrix M^n, where M={{10, 9, 7, 4}, {9, 8, 6, 3}, {7, 6, 4, 2}, {4, 3, 2, 1}}.
 * @author Sean A. Irvine
 */
public class A122186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122186() {
    super(new long[] {-1, -4, 21, 23}, new long[] {1, 30, 707, 16886});
  }
}
