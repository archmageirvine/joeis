package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158667 a(n) = 841*n^2 - 29.
 * @author Sean A. Irvine
 */
public class A158667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158667() {
    super(1, new long[] {1, -3, 3}, new long[] {812, 3335, 7540});
  }
}
