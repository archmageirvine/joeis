package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138229 Expansion of <code>(1-x)/(1-2x+6x^2)</code>.
 * @author Sean A. Irvine
 */
public class A138229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138229() {
    super(new long[] {-6, 2}, new long[] {1, 1});
  }
}
