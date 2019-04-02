package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177468 Expansion of g.f.: (1+x+12*x^2-8*x^3)/(1-5*x-30*x^2+69*x^3+31*x^4-22*x^5).
 * @author Sean A. Irvine
 */
public class A177468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177468() {
    super(new long[] {22, -31, -69, 30, 5}, new long[] {1, 6, 72, 463, 4030});
  }
}
