package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158667 841*n^2 - 29.
 * @author Sean A. Irvine
 */
public class A158667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158667() {
    super(new long[] {1, -3, 3}, new long[] {812, 3335, 7540});
  }
}
