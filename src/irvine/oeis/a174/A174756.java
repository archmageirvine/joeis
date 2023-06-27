package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174756 x-values in the solution to x^2-51*y^2=1.
 * @author Sean A. Irvine
 */
public class A174756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174756() {
    super(1, new long[] {-1, 100}, new long[] {1, 50});
  }
}
