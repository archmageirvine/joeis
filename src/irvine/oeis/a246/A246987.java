package irvine.oeis.a246;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A246987 Expansion of (1-11*x+34*x^2-21*x^3+2*x^4)/((1-x)*(1-2*x)*(1-4*x)*(1-5*x)*(1-6*x)).
 * @author Sean A. Irvine
 */
public class A246987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246987() {
    super(new long[] {240, -508, 372, -121, 18}, new long[] {1, 7, 39, 206, 1087});
  }
}
