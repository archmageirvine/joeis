package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174775 y-values in the solution to  x^2 - 37*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A174775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174775() {
    super(new long[] {-1, 146}, new long[] {0, 12});
  }
}
