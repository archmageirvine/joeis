package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101463 G.f.: (x^3+x^2+2*x+1)/(x^4+5*x^2+1).
 * @author Sean A. Irvine
 */
public class A101463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101463() {
    super(new long[] {-1, 0, -5, 0}, new long[] {1, 2, -4, -9});
  }
}
