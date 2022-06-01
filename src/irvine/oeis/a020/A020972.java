package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020972 Expansion of 1/((1-7*x)*(1-9*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A020972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020972() {
    super(new long[] {756, -255, 28}, new long[] {1, 28, 529});
  }
}
