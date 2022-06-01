package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133285 Indices of the centered 12-gonal numbers which are also 12-gonal number, or numbers X such that 120*X^2-120*X+36 is a square.
 * @author Sean A. Irvine
 */
public class A133285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133285() {
    super(new long[] {1, -23, 23}, new long[] {1, 12, 253});
  }
}
