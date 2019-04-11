package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151981 Numbers n such that <code>n^2 - n</code> is divisible by 48.
 * @author Sean A. Irvine
 */
public class A151981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151981() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 16, 33, 48});
  }
}
