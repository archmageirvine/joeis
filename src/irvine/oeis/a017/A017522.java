package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017522 a(n) = (12*n)^2.
 * @author Sean A. Irvine
 */
public class A017522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017522() {
    super(new long[] {1, -3, 3}, new long[] {0, 144, 576});
  }
}
