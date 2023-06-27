package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228545 y-values in the solution to the Pell equation x^2 - 61*y^2 = -1.
 * @author Sean A. Irvine
 */
public class A228545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228545() {
    super(1, new long[] {-1, 3532638098L}, new long[] {3805, 13441687959085L});
  }
}
