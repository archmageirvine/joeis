package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017534 a(n) = (12*n + 1)^2.
 * @author Sean A. Irvine
 */
public class A017534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017534() {
    super(new long[] {1, -3, 3}, new long[] {1, 169, 625});
  }
}
