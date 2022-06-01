package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017151 a(n) = (8*n + 7)^3.
 * @author Sean A. Irvine
 */
public class A017151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017151() {
    super(new long[] {-1, 4, -6, 4}, new long[] {343, 3375, 12167, 29791});
  }
}
