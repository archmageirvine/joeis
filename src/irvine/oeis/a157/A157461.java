package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157461 Expansion of <code>x*(x+1) / (x^2-26*x+1)</code>.
 * @author Sean A. Irvine
 */
public class A157461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157461() {
    super(new long[] {-1, 26}, new long[] {1, 27});
  }
}
