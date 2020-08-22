package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174768 y-values in the solution to x^2 - 26*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A174768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174768() {
    super(new long[] {-1, 102}, new long[] {0, 10});
  }
}
