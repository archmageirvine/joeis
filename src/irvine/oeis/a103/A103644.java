package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103644 Expansion of g.f. (3x+1)/((1-3*x)*(1+5*x+9*x^2)).
 * @author Sean A. Irvine
 */
public class A103644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103644() {
    super(new long[] {27, 6, -2}, new long[] {1, 1, 4});
  }
}
