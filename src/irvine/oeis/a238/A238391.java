package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238391 Expansion of (1+x)/(1-x^2-3*x^5).
 * @author Sean A. Irvine
 */
public class A238391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238391() {
    super(new long[] {3, 0, 0, 1, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
