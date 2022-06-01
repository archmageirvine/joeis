package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157448 a(n) = 2048*n^2 - 128*n + 1.
 * @author Sean A. Irvine
 */
public class A157448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157448() {
    super(new long[] {1, -3, 3}, new long[] {1921, 7937, 18049});
  }
}
