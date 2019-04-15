package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233450 Numbers n such that <code>3*T(n)+1</code> is a square, where T = A000217.
 * @author Sean A. Irvine
 */
public class A233450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233450() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {0, 1, 6, 15, 64});
  }
}
