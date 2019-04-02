package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181995 a(n) = if n mod 2 = 1 then n*(n - 1) else (n - 1)^2 + (n - 2)/2.
 * @author Sean A. Irvine
 */
public class A181995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181995() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 0, 1, 6, 10});
  }
}
