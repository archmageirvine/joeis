package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077841 Expansion of <code>(1-x)/(1-2*x-3*x^2-2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077841() {
    super(new long[] {2, 3, 2}, new long[] {1, 1, 5});
  }
}
