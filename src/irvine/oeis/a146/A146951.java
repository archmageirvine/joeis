package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146951 Rank of terms of A061047 ending in with 0.
 * @author Sean A. Irvine
 */
public class A146951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146951() {
    super(new long[] {-1, 1, 1}, new long[] {0, 6, 10});
  }
}
