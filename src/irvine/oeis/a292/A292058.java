package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292058 Wiener index of the n X n rook complement graph.
 * @author Sean A. Irvine
 */
public class A292058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292058() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 10, 54, 168, 400});
  }
}
