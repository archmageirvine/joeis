package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023951 Expansion of g.f. 1/((1-x)*(1-6*x)*(1-7*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A023951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023951() {
    super(new long[] {-420, 592, -195, 24}, new long[] {1, 24, 381, 5056});
  }
}
