package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057081 Even indexed Chebyshev U-polynomials evaluated at sqrt(11)/2.
 * @author Sean A. Irvine
 */
public class A057081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057081() {
    super(new long[] {-1, 9}, new long[] {1, 10});
  }
}
