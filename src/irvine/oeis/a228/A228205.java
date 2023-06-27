package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228205 x-values in the solution to x^2 - 13y^2 = 108.
 * @author Sean A. Irvine
 */
public class A228205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228205() {
    super(1, new long[] {-1, 0, 0, 0, 11, 0, 0, 0}, new long[] {11, 15, 24, 41, 80, 141, 249, 440});
  }
}
