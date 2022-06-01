package irvine.oeis.a240;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A240355 Inverse of 72nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A240355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240355() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
