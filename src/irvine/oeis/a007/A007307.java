package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007307 a(n) = a(n-2) + a(n-3), with a(0) = 0, a(1) = 1, a(2) = 2.
 * @author Sean A. Irvine
 */
public class A007307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007307() {
    super(new long[] {1, 1, 0}, new long[] {0, 1, 2});
  }
}

