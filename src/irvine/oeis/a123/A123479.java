package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123479 Coefficients of series giving the best rational approximations to sqrt(6).
 * @author Sean A. Irvine
 */
public class A123479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123479() {
    super(1, new long[] {1, -99, 99}, new long[] {20, 1980, 194040});
  }
}
