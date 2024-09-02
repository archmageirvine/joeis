package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100295 Expansion of g.f. x*(1-x)/(1-4*x-2*x^2+x^3).
 * @author Sean A. Irvine
 */
public class A100295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100295() {
    super(1, new long[] {-1, 2, 4}, new long[] {1, 3, 14});
  }
}
