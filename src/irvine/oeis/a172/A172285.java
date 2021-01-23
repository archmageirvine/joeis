package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172285 a(n) = (5*2^n - 5*(-1)^n - 3*n*(-1)^n) / 9.
 * @author Sean A. Irvine
 */
public class A172285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172285() {
    super(new long[] {2, 3, 0}, new long[] {0, 2, 1});
  }
}
