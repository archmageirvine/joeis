package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157461 Expansion of x*(x+1) / (x^2-26*x+1).
 * @author Sean A. Irvine
 */
public class A157461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157461() {
    super(new long[] {-1, 26}, new long[] {1, 27});
  }
}
