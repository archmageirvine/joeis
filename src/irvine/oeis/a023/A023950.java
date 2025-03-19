package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023950 Expansion of g.f. 1/((1-x)*(1-6*x)*(1-7*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A023950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023950() {
    super(new long[] {-378, 537, -181, 23}, new long[] {1, 23, 348, 4378});
  }
}
