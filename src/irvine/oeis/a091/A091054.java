package irvine.oeis.a091;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A091054 Expansion of (1 - 5*x - 2*x^2) / ((1 - x)*(1 + 2*x)*(1 - 6*x)).
 * @author Sean A. Irvine
 */
public class A091054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091054() {
    super(new long[] {-12, 8, 5}, new long[] {1, 0, 6});
  }
}
