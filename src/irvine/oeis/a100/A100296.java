package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100296 Expansion of g.f. x*(1+2*x-x^2)/(1-4*x-2*x^2+x^3).
 * @author Sean A. Irvine
 */
public class A100296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100296() {
    super(1, new long[] {-1, 2, 4}, new long[] {1, 6, 25});
  }
}
