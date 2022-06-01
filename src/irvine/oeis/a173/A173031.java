package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173031 Sequence whose G.f is given by: 1/(1-z)/(1-2*z)^2/(1-z-z^2).
 * @author Sean A. Irvine
 */
public class A173031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173031() {
    super(new long[] {-4, 4, 7, -12, 6}, new long[] {1, 6, 24, 79, 232});
  }
}
