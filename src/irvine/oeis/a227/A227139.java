package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227139 Chebyshev S-polynomial evaluated at <code>x = 48</code>.
 * @author Sean A. Irvine
 */
public class A227139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227139() {
    super(new long[] {-1, 48}, new long[] {1, 48});
  }
}
