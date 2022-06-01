package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007070 a(n) = 4*a(n-1) - 2*a(n-2) with a(0) = 1, a(1) = 4.
 * @author Sean A. Irvine
 */
public class A007070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007070() {
    super(new long[] {-2, 4}, new long[] {1, 4});
  }
}

