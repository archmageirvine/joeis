package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272399 The intersection of hexagonal numbers <code>(A000384)</code> and centered 9-gonal numbers <code>(A060544)</code>.
 * @author Sean A. Irvine
 */
public class A272399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272399() {
    super(new long[] {1, -3, 3}, new long[] {1, 28, 91});
  }
}
