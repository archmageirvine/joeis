package irvine.oeis.a224;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A224692 Expansion of (1+5*x+7*x^2-x^3)/((1-2*x^2)*(1-x)*(1+x)).
 * @author Sean A. Irvine
 */
public class A224692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224692() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 5, 10, 14});
  }
}
