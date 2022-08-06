package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099568 Expansion of (1-x)/((1-2*x)*(1-x-x^3)).
 * @author Sean A. Irvine
 */
public class A099568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099568() {
    super(new long[] {-2, 1, -2, 3}, new long[] {1, 2, 4, 9});
  }
}
