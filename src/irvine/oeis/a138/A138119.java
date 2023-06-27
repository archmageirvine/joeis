package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138119 Concatenation of n digits 1 and 2n-1 digits 0.
 * @author Sean A. Irvine
 */
public class A138119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138119() {
    super(1, new long[] {-100000, 1100}, new long[] {10, 11000});
  }
}
