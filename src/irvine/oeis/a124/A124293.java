package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124293 Number of free generators of degree n of symmetric polynomials in 5-noncommuting variables.
 * @author Sean A. Irvine
 */
public class A124293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124293() {
    super(new long[] {-11, 37, -32, 10}, new long[] {1, 1, 2, 6});
  }
}
