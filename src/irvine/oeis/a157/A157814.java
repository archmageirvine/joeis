package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157814 a(n) = 27225*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A157814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157814() {
    super(1, new long[] {1, -3, 3}, new long[] {27223, 108896, 245019});
  }
}
