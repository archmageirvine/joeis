package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146535 Numerator of (2*n-1)/3.
 * @author Sean A. Irvine
 */
public class A146535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146535() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 1, 5, 7, 3, 11});
  }
}
