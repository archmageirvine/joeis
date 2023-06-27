package irvine.oeis.a202;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A202280 y-values in the solutions to x^2 - 151*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A202280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202280() {
    super(1, new long[] {-1, 3456296080L}, new long[] {0, 140634693});
  }
}
