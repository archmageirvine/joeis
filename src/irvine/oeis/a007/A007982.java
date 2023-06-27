package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007982 Number of non-Abelian metacyclic groups of order 2^n.
 * @author Sean A. Irvine
 */
public class A007982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007982() {
    super(1, new long[] {0, 0, 0, -1, 1, 2, -1, -2, -1, 2, 1}, new long[] {0, 0, 2, 5, 9, 15, 22, 32, 43, 57, 72});
  }
}
