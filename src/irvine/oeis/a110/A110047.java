package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110047 Expansion of (1+2*x-4*x^2)/((2*x+1)*(2*x-1)*(4*x^2+4*x-1)).
 * @author Sean A. Irvine
 */
public class A110047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110047() {
    super(new long[] {-16, -16, 8, 4}, new long[] {1, 6, 28, 144});
  }
}
