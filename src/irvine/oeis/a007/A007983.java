package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007983 Number of non-Abelian metacyclic groups of order p^n (p odd).
 * @author Sean A. Irvine
 */
public class A007983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007983() {
    super(1, new long[] {-1, 1, 2, -1, -2, -1, 2, 1}, new long[] {0, 0, 1, 2, 4, 7, 10, 15});
  }
}
