package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157877 Expansion of <code>(1-x)*x/(x^2-30*x+1)</code>.
 * @author Sean A. Irvine
 */
public class A157877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157877() {
    super(new long[] {-1, 30}, new long[] {1, 29});
  }
}
