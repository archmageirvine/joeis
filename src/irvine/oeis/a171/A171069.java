package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171069 G.f. -x*(x-1)*(1+x)/(1-x-12*x^2-x^3+x^4).
 * @author Sean A. Irvine
 */
public class A171069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171069() {
    super(new long[] {-1, 1, 12, 1}, new long[] {0, 1, 1, 12});
  }
}
