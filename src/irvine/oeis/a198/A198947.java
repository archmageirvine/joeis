package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198947 x values in the solution to 11*x^2 - 10 = y^2.
 * @author Sean A. Irvine
 */
public class A198947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198947() {
    super(1, new long[] {-1, 0, 20, 0}, new long[] {1, 7, 13, 139});
  }
}
