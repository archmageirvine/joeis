package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107852 Expansion of -x*(x^2+1)*(x+1)^2/((2*x^3+x^2-1)*(x^4+1)).
 * @author Sean A. Irvine
 */
public class A107852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107852() {
    super(new long[] {2, 1, 0, -1, 2, 1, 0}, new long[] {0, 1, 2, 3, 6, 7, 10});
  }
}
