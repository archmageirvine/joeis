package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227274 Positive solutions of the Pell equation x^2 - 97*y^2 = -1. Solutions x = 5604*a(n).
 * @author Sean A. Irvine
 */
public class A227274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227274() {
    super(new long[] {-1, 125619266}, new long[] {1, 125619267});
  }
}
