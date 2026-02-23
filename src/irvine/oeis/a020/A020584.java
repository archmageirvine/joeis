package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020584 Expansion of 1/((1-6*x)*(1-8*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A020584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020584() {
    super(new long[] {480, -188, 24}, new long[] {1, 24, 388});
  }
}
