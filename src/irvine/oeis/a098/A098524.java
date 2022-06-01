package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098524 Expansion of (1+2x^2)/(1-x-4x^5).
 * @author Sean A. Irvine
 */
public class A098524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098524() {
    super(new long[] {4, 0, 0, 0, 1}, new long[] {1, 1, 3, 3, 3});
  }
}
