package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195058 Concentric 23-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195058() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 23, 47});
  }
}
