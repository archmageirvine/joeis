package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094211 a(n) = Sum_{k=0..n} binomial(7*n,7*k).
 * @author Sean A. Irvine
 */
public class A094211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094211() {
    super(new long[] {-128, -36991, 7585, 71}, new long[] {1, 2, 3434, 232562});
  }
}
