package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074677 a(n) = Sum_{i = 0..floor(n/2)} (-1)^(i + floor(n/2)) F(2*i + e), where F = A000045 (Fibonacci numbers) and e = (1-(-1)^n)/2.
 * @author Sean A. Irvine
 */
public class A074677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074677() {
    super(new long[] {1, 1, 0, 1}, new long[] {0, 1, 1, 1});
  }
}
