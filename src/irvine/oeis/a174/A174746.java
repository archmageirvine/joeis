package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174746 x-values in the solution to x^2-31*y^2=1.
 * @author Sean A. Irvine
 */
public class A174746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174746() {
    super(new long[] {-1, 3040}, new long[] {1, 1520});
  }
}
