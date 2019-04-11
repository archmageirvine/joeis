package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030440 Values of Newton-Gregory forward interpolating polynomial <code>(1/3)*(n-1)*(2*n+3)*(2*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A030440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030440() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 0, 7, 30});
  }
}
