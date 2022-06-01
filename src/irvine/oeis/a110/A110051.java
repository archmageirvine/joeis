package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110051 Expansion of (1-x+2*x^3+x^2)/((1-x)*(2*x+1)*(2*x-1)*(4*x^2+4*x-1)).
 * @author Sean A. Irvine
 */
public class A110051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110051() {
    super(new long[] {16, 0, -24, 4, 5}, new long[] {1, 4, 25, 119, 599});
  }
}
