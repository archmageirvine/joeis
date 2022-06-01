package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017318 a(n) = (10*n + 4)^2.
 * @author Sean A. Irvine
 */
public class A017318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017318() {
    super(new long[] {1, -3, 3}, new long[] {16, 196, 576});
  }
}
