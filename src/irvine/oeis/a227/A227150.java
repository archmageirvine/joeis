package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227150 Nonnegative solutions of the Pell equation x^2 - 97*y^2 = +1. Solutions x = a(n).
 * @author Sean A. Irvine
 */
public class A227150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227150() {
    super(new long[] {-1, 125619266}, new long[] {1, 62809633});
  }
}
