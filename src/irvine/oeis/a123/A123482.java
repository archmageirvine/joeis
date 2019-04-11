package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123482 Coefficients of the series giving the best rational approximations to <code>sqrt(11)</code>.
 * @author Sean A. Irvine
 */
public class A123482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123482() {
    super(new long[] {1, -399, 399}, new long[] {60, 23940, 9528120});
  }
}
