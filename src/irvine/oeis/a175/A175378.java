package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175378 G.f. <code>x^4*(2*x^2-1)/( (x^2-1)*(x^2+x-1)*(2*x^3-2*x^2+2*x-1) )</code>.
 * @author Sean A. Irvine
 */
public class A175378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175378() {
    super(new long[] {2, 0, -4, 3, -1, -2, 3}, new long[] {0, 0, 0, 0, 1, 3, 5});
  }
}
