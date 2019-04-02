package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154879 Third differences of the Jacobsthal sequence A001045.
 * @author Sean A. Irvine
 */
public class A154879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154879() {
    super(new long[] {2, 1}, new long[] {3, -2});
  }
}
