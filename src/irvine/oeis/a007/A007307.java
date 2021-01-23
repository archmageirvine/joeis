package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007307 a(n) = a(n-2) + a(n-3).
 * @author Sean A. Irvine
 */
public class A007307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007307() {
    super(new long[] {1, 1, 0}, new long[] {0, 1, 2});
  }
}

