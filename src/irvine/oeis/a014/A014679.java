package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014679 G.f.: (1+x^3)^2/((1-x^2)*(1-x^3)*(1-x^4)).
 * @author Sean A. Irvine
 */
public class A014679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014679() {
    super(new long[] {1, -2, 2, -3, 3, -2, 2}, new long[] {1, 0, 1, 3, 2, 3, 6});
  }
}

