package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083709 G.f.: (1-x+2*x^2+2*x^3+2*x^4-x^5+x^6)/((1-x)*(1-x^2)^2*(1-x^3)).
 * @author Sean A. Irvine
 */
public class A083709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083709() {
    super(new long[] {-1, 1, 2, -1, -2, -1, 2, 1}, new long[] {1, 0, 4, 5, 13, 17, 33, 41});
  }
}
