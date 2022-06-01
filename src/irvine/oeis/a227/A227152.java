package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227152 Nonnegative solutions of the Pell equation x^2 - 101*y^2 = +1. Solutions x = a(n).
 * @author Sean A. Irvine
 */
public class A227152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227152() {
    super(new long[] {-1, 402}, new long[] {1, 201});
  }
}
