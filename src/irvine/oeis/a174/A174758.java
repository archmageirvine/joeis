package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174758 x-values in the solution to x^2-55*y^2=1.
 * @author Sean A. Irvine
 */
public class A174758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174758() {
    super(new long[] {-1, 178}, new long[] {1, 89});
  }
}
