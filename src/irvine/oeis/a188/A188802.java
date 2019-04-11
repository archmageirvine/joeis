package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188802 Expansion of <code>(x^2+1)/(x^4+2*x^3-2*x+1)</code>.
 * @author Sean A. Irvine
 */
public class A188802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188802() {
    super(new long[] {-1, -2, 0, 2}, new long[] {1, 2, 5, 8});
  }
}
