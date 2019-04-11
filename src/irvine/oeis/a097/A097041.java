package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097041 Expansion of <code>(1+x)/(1-x^2-9*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A097041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097041() {
    super(new long[] {9, 1, 0}, new long[] {1, 1, 1});
  }
}
