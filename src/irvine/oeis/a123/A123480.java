package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123480 Coefficients of the series giving the best rational approximations to sqrt(3).
 * @author Sean A. Irvine
 */
public class A123480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123480() {
    super(new long[] {1, -15, 15}, new long[] {4, 60, 840});
  }
}
