package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256666 a(n) = ( 2*n*(2*n^2 + 11*n + 26) - (-1)^n + 1 )/16.
 * @author Sean A. Irvine
 */
public class A256666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256666() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 5, 14, 29, 51});
  }
}
