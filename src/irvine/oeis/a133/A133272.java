package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133272 Indices of centered heptagonal numbers <code>(A069099)</code> which are also heptagonal numbers <code>(A000566)</code>.
 * @author Sean A. Irvine
 */
public class A133272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133272() {
    super(new long[] {1, -13, 13}, new long[] {1, 7, 78});
  }
}
