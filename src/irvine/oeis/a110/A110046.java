package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110046 Expansion of <code>(1+4*x-12*x^2-16*x^3)/((2*x+1)*(2*x-1)*(4*x^2+4*x-1))</code>.
 * @author Sean A. Irvine
 */
public class A110046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110046() {
    super(new long[] {-16, -16, 8, 4}, new long[] {1, 8, 28, 144});
  }
}
