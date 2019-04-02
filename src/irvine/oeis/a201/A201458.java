package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201458 Expansion of 1/((1-2*x)*(1-3*x+3*x^2)*(1-4*x+6*x^2-4*x^3)).
 * @author Sean A. Irvine
 */
public class A201458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201458() {
    super(new long[] {-24, 72, -98, 76, -35, 9}, new long[] {1, 9, 46, 175, 551, 1520});
  }
}
