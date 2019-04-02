package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124292 Number of free generators of degree n of symmetric polynomials in 4 noncommuting variables.
 * @author Sean A. Irvine
 */
public class A124292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124292() {
    super(new long[] {3, -9, 6}, new long[] {1, 1, 2});
  }
}
