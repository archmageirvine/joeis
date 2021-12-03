package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122584 Expansion of x*(1+x)*(2*x-1) / ( -1+2*x+x^2-2*x^3+x^4 ).
 * @author Sean A. Irvine
 */
public class A122584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122584() {
    super(new long[] {1, -2, 1, 2}, new long[] {1, 1, 1, 1});
  }
}
