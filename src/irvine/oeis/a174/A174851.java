package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174851 y-values in the solution to x^2-46*y^2=1.
 * @author Sean A. Irvine
 */
public class A174851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174851() {
    super(new long[] {-1, 48670}, new long[] {0, 3588});
  }
}
