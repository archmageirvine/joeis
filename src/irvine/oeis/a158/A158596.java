package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158596 a(n) = 38*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158596() {
    super(new long[] {1, -3, 3}, new long[] {37, 151, 341});
  }
}
