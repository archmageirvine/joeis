package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079524 Expansion of <code>(x +</code> b*x^2 - b*x^3)/((1 <code>- x^2)*(1 - x)^2)</code> with b=2.
 * @author Sean A. Irvine
 */
public class A079524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079524() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 4, 6});
  }
}
