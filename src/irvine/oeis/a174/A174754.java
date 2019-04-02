package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174754 x-values in the solution to x^2-46*y^2=1.
 * @author Sean A. Irvine
 */
public class A174754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174754() {
    super(new long[] {-1, 48670}, new long[] {1, 24335});
  }
}
