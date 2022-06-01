package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157456 Expansion of x*(1-x) / ( 1 - 16*x + x^2 ).
 * @author Sean A. Irvine
 */
public class A157456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157456() {
    super(new long[] {-1, 16}, new long[] {1, 15});
  }
}
