package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122520 Expansion of x*(1+2*x+3*x^2+4*x^3+4*x^4)/(1+x+x^2+x^3-x^5).
 * @author Sean A. Irvine
 */
public class A122520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122520() {
    super(1, new long[] {1, 0, -1, -1, -1}, new long[] {1, 1, 1, 1, 1});
  }
}
