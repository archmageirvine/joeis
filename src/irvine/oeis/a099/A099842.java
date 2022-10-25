package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099842 Expansion of (1-x)/(1 + 6*x - 3*x^2).
 * @author Sean A. Irvine
 */
public class A099842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099842() {
    super(new long[] {3, -6}, new long[] {1, -7});
  }
}
