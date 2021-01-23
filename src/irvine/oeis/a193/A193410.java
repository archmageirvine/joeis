package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193410 Expansion of (1-3*x)/(1-6*x+18*x^2).
 * @author Sean A. Irvine
 */
public class A193410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193410() {
    super(new long[] {-18, 6}, new long[] {1, 3});
  }
}
