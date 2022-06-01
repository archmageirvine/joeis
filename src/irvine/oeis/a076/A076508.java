package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076508 Expansion of 2*x*(1+4*x+8*x^2)/(1-24*x^3).
 * @author Sean A. Irvine
 */
public class A076508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076508() {
    super(new long[] {24, 0, 0}, new long[] {2, 8, 16});
  }
}
