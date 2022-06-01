package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076510 Expansion of 3*(1+2*x+6 x^2)/(1-24*x^3).
 * @author Sean A. Irvine
 */
public class A076510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076510() {
    super(new long[] {24, 0, 0}, new long[] {3, 6, 18});
  }
}
