package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141523 Expansion of <code>(3-2*x-3*x^2)/(1-x-x^2-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A141523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141523() {
    super(new long[] {1, 1, 1}, new long[] {3, 1, 1});
  }
}
