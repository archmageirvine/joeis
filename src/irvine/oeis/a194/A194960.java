package irvine.oeis.a194;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A194960 a(n) = floor((n+2)/3) + ((n-1) mod 3).
 * @author Sean A. Irvine
 */
public class A194960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194960() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 2, 3, 2});
  }
}
