package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100213 Expansion of g.f.: x*(4-7*x+2*x^2-8*x^4+16*x^5-16*x^6)/((1-2*x) * (1-2*x^2) * (1-2*x+2*x^2) * (1+2*x^2)).
 * @author Sean A. Irvine
 */
public class A100213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100213() {
    super(1, new long[] {-16, 24, -16, 4, 4, -6, 4}, new long[] {4, 9, 14, 18, 32, 64, 128});
  }
}
