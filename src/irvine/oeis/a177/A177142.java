package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177142 Expansion of x*(1+x)*(1+5*x-8*x^2)/(1-5*x-30*x^2+69*x^3+31*x^4-22*x^5).
 * @author Sean A. Irvine
 */
public class A177142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177142() {
    super(new long[] {22, -31, -69, 30, 5}, new long[] {1, 11, 82, 663, 4985});
  }
}
