package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017019 a(n) = (7*n + 3)^3.
 * @author Sean A. Irvine
 */
public class A017019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017019() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 1000, 4913, 13824});
  }
}
