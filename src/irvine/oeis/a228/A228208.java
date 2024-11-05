package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228208 y-values in the solution to x^2 - 20*y^2 = 176.
 * @author Sean A. Irvine
 */
public class A228208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228208() {
    super(1, new long[] {-1, 0, 3, 0}, new long[] {1, 2, 5, 7});
  }
}
