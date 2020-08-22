package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017138 a(n) = (8*n+6)^2.
 * @author Sean A. Irvine
 */
public class A017138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017138() {
    super(new long[] {1, -3, 3}, new long[] {36, 196, 484});
  }
}
