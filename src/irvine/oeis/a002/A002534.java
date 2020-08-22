package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002534 a(n) = 2*a(n-1) + 9*a(n-2).
 * @author Sean A. Irvine
 */
public class A002534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002534() {
    super(new long[] {9, 2}, new long[] {0, 1});
  }
}
