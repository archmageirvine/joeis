package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098648 Expansion of (1-3*x)/(1 - 6*x + 4*x^2).
 * @author Sean A. Irvine
 */
public class A098648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098648() {
    super(new long[] {-4, 6}, new long[] {1, 3});
  }
}
