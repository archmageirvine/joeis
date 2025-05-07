package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020447 Expansion of 1/((1-5*x) * (1-8*x) * (1-11*x)).
 * @author Sean A. Irvine
 */
public class A020447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020447() {
    super(new long[] {440, -183, 24}, new long[] {1, 24, 393});
  }
}
