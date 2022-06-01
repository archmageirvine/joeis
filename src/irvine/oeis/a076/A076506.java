package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076506 Expansion of x*(1+3*x+12*x^2)/(1-24*x^3).
 * @author Sean A. Irvine
 */
public class A076506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076506() {
    super(new long[] {24, 0, 0}, new long[] {1, 3, 12});
  }
}
