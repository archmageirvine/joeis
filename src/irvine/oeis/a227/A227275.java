package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227275 Positive solutions of the Pell equation x^2 - 97*y^2 = -1. Solutions y = 569*a(n).
 * @author Sean A. Irvine
 */
public class A227275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227275() {
    super(new long[] {-1, 125619266}, new long[] {1, 125619265});
  }
}
