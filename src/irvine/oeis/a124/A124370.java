package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124370 Expansion of 1/(1-2x^2-3x^3-x^4).
 * @author Sean A. Irvine
 */
public class A124370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124370() {
    super(new long[] {1, 3, 2, 0}, new long[] {1, 0, 2, 3});
  }
}
