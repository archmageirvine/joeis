package irvine.oeis.a191;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A191272 Expansion of x*(4+5*x)/( (1-4*x)*(1 + x + x^2) ).
 * @author Sean A. Irvine
 */
public class A191272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191272() {
    super(new long[] {4, 3, 3}, new long[] {0, 4, 17});
  }
}
