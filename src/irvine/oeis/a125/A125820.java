package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125820 a(n) = ((1 + 7*sqrt(2))^n + (1 - 7*sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A125820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125820() {
    super(1, new long[] {97, 2}, new long[] {1, 1});
  }
}
