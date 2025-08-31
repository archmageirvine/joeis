package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028159 Expansion of 1/((1-4*x)*(1-8*x)*(1-10*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A028159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028159() {
    super(new long[] {-3840, 2144, -416, 34}, new long[] {1, 34, 740, 13160});
  }
}
