package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017080 a(n) = (8*n + 1)^4.
 * @author Sean A. Irvine
 */
public class A017080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017080() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 6561, 83521, 390625, 1185921});
  }
}
