package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017451 a(n) = (11*n + 5)^3.
 * @author Sean A. Irvine
 */
public class A017451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017451() {
    super(new long[] {-1, 4, -6, 4}, new long[] {125, 4096, 19683, 54872});
  }
}
