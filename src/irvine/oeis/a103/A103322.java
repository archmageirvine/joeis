package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103322 Expansion of <code>1 / ((1-x-x^2-x^3)*(1-x^2-x^3))</code>.
 * @author Sean A. Irvine
 */
public class A103322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103322() {
    super(new long[] {-1, -2, -2, 1, 2, 1}, new long[] {1, 1, 3, 6, 11, 22});
  }
}
