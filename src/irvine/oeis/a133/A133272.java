package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133272 Indices of centered heptagonal numbers (A069099) which are also heptagonal numbers (A000566).
 * @author Sean A. Irvine
 */
public class A133272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133272() {
    super(new long[] {1, -13, 13}, new long[] {1, 7, 78});
  }
}
