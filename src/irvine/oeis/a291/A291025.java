package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291025 p-INVERT of the positive integers, where p(S) = 1 - 3*S + S^2.
 * @author Sean A. Irvine
 */
public class A291025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291025() {
    super(new long[] {-1, 7, -13, 7}, new long[] {3, 14, 62, 273});
  }
}
