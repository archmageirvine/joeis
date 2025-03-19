package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023954 Expansion of g.f. 1/((1-x)*(1-6*x)*(1-8*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A023954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023954() {
    super(new long[] {-432, 606, -197, 24}, new long[] {1, 24, 379, 4974});
  }
}
