package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106851 Expansion of (-3*x^3 - 7*x^2 + 2*x)/((1-4*x-x^2)*(1-4*x+x^2)).
 * @author Sean A. Irvine
 */
public class A106851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106851() {
    super(new long[] {1, 0, -16, 8}, new long[] {0, 2, 9, 37});
  }
}
