package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291988 Expansion of <code>1/((1-x)*(1-2*x^2)*(1-3*x^3)*(1-4*x^4)*(1-5*x^5))</code>.
 * @author Sean A. Irvine
 */
public class A291988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291988() {
    super(new long[] {120, -120, -60, 20, 10, 26, 19, 7, -14, -7, -5, 1, 1, 2, 1}, new long[] {1, 1, 3, 6, 14, 25, 50, 84, 165, 280, 503, 826, 1477, 2386, 4067});
  }
}
