package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099025 Expansion of 1 / ((1+x) * (1-5*x+x^2)).
 * @author Sean A. Irvine
 */
public class A099025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099025() {
    super(new long[] {-1, 4, 4}, new long[] {1, 4, 20});
  }
}
