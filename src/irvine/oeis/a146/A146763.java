package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146763 Rank of terms ending in 0 in A061039.
 * @author Sean A. Irvine
 */
public class A146763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146763() {
    super(new long[] {-1, 1, 1}, new long[] {0, 4, 10});
  }
}
