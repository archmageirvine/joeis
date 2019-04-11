package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157456 Expansion of <code>x*(1-x) / ( 1 - 16*x + x^2 )</code>.
 * @author Sean A. Irvine
 */
public class A157456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157456() {
    super(new long[] {-1, 16}, new long[] {1, 15});
  }
}
