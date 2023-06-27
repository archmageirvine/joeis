package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140806 Expansion of x *(1+x) *(x^2+1) *(15*x^4+1) / ( (x^4-2*x^3+2*x^2+2*x+1) *(x^4+2*x^3+2*x^2-2*x+1) ).
 * @author Sean A. Irvine
 */
public class A140806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140806() {
    super(1, new long[] {-1, 0, 0, 0, -14, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1});
  }
}
