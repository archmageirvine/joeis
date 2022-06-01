package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272399 The intersection of hexagonal numbers (A000384) and centered 9-gonal numbers (A060544).
 * @author Sean A. Irvine
 */
public class A272399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272399() {
    super(new long[] {1, -3, 3}, new long[] {1, 28, 91});
  }
}
