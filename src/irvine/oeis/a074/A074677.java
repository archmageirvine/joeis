package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074677 <code>a(n) =</code> Sum_{i <code>= 0..floor(n/2)}</code> (-1)^(i <code>+ floor(n/2))</code> F(2*i + e), where F = A000045 (Fibonacci numbers) and e <code>= (1-(-1)^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A074677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074677() {
    super(new long[] {1, 1, 0, 1}, new long[] {0, 1, 1, 1});
  }
}
