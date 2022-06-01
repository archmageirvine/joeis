package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110689 Expansion of (2*x+1)*(4*x^2+8*x+1)/((3*x^2+3*x+1)*(2*x^3+2*x^2+4*x+1)).
 * @author Sean A. Irvine
 */
public class A110689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110689() {
    super(new long[] {-6, -12, -20, -17, -7}, new long[] {1, 3, -18, 63, -207});
  }
}
