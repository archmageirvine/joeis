package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157760 a(n) = 2809*n^2 - 1000*n + 89.
 * @author Sean A. Irvine
 */
public class A157760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157760() {
    super(new long[] {1, -3, 3}, new long[] {1898, 9325, 22370});
  }
}
