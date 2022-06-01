package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158406 a(n) = 900*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A158406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158406() {
    super(new long[] {1, -3, 3}, new long[] {902, 3604, 8106});
  }
}
