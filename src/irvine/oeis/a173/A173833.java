package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173833 10^n - 3.
 * @author Sean A. Irvine
 */
public class A173833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173833() {
    super(new long[] {-10, 11}, new long[] {7, 97});
  }
}
