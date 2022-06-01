package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128223 a(n) = if n mod 2 = 0 then n*(n+1)/2 otherwise (n+1)^2/2-1.
 * @author Sean A. Irvine
 */
public class A128223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128223() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 3, 7, 10});
  }
}
