package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035608 Expansion of <code>x*(1 + 3*x)/((1 + x)*(1 - x)^3)</code>.
 * @author Sean A. Irvine
 */
public class A035608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035608() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 5, 10});
  }
}
