package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098526 Expansion of (1+4x^2)/(1-x-16x^5).
 * @author Sean A. Irvine
 */
public class A098526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098526() {
    super(new long[] {16, 0, 0, 0, 1}, new long[] {1, 1, 5, 5, 5});
  }
}
