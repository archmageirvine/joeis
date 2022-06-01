package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157447 a(n) = 512*n - 16.
 * @author Sean A. Irvine
 */
public class A157447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157447() {
    super(new long[] {-1, 2}, new long[] {496, 1008});
  }
}
