package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023947 Expansion of g.f. 1/((1-x)*(1-5*x)*(1-10*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A023947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023947() {
    super(new long[] {-600, 830, -257, 28}, new long[] {1, 28, 527, 8390});
  }
}
