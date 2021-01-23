package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238389 Expansion of (1+x)/(1-x^2-3*x^3).
 * @author Sean A. Irvine
 */
public class A238389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238389() {
    super(new long[] {3, 1, 0}, new long[] {1, 1, 1});
  }
}
