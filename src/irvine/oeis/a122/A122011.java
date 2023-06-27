package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122011 G.f. x^2*(1+x)/(1-12*x+15*x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A122011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122011() {
    super(1, new long[] {2, -15, 12}, new long[] {0, 1, 13});
  }
}
