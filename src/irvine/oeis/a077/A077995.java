package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077995 Expansion of <code>(1-x)/(1-2*x-2*x^2-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077995() {
    super(new long[] {1, 2, 2}, new long[] {1, 1, 4});
  }
}
