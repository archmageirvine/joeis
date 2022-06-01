package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084672 G.f.: (1+x^2+2*x^4)/((1-x^3)*(1-x)^2).
 * @author Sean A. Irvine
 */
public class A084672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084672() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 2, 4, 7, 12});
  }
}
