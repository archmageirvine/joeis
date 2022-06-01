package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195321 a(n) = 18*n^2.
 * @author Sean A. Irvine
 */
public class A195321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195321() {
    super(new long[] {1, -3, 3}, new long[] {0, 18, 72});
  }
}
