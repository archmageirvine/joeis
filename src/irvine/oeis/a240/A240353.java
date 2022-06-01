package irvine.oeis.a240;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A240353 Inverse of 68th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A240353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240353() {
    super(new long[] {-1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0}, new long[] {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
