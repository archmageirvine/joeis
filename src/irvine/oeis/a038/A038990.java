package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038990 Expansion of (1-x-x^2+2*x^3) / ((1-x)*(1+x)*(1-3*x+x^2)).
 * @author Sean A. Irvine
 */
public class A038990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038990() {
    super(new long[] {1, -3, 0, 3}, new long[] {1, 2, 5, 14});
  }
}
