package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019958 Expansion of 1/((1-5*x)*(1-7*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A019958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019958() {
    super(new long[] {350, -155, 22}, new long[] {1, 22, 329});
  }
}
