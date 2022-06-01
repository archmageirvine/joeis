package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227047 Expansion of x^2*(1+x^2) / ( (x^2-x+1)*(-x^2-x+1)*(1+x+x^2) ).
 * @author Sean A. Irvine
 */
public class A227047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227047() {
    super(new long[] {1, 1, 0, 1, 0, 1}, new long[] {0, 0, 1, 1, 2, 3});
  }
}
