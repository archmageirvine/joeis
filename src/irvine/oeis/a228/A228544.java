package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228544 x-values in the solution to the Pell equation x^2 - 61*y^2 = -1.
 * @author Sean A. Irvine
 */
public class A228544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228544() {
    super(1, new long[] {-1, 3532638098L}, new long[] {29718, 104982939026082L});
  }
}
