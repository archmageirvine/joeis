package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158416 Expansion of g.f. (1+x-x^3)/(1-x^2)^2.
 * @author Sean A. Irvine
 */
public class A158416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158416() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 1, 2, 1});
  }
}
