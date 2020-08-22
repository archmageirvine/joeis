package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245467 a(n) = ( 4*n^2 - 2*n + 1 - (2*n^2 - 6*n + 1) * (-1)^n )/16.
 * @author Sean A. Irvine
 */
public class A245467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245467() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 0, 1, 2, 3, 7});
  }
}
