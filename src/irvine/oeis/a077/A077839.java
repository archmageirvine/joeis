package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077839 Expansion of (1 - x)/(1 - 3*x - 2*x^2 - 2*x^3).
 * @author Sean A. Irvine
 */
public class A077839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077839() {
    super(new long[] {2, 2, 3}, new long[] {1, 2, 8});
  }
}
