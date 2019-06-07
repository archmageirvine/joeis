package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024857 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (natural numbers), <code>t =</code> (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024857() {
    super(new long[] {1, 1, 1, 2, -3, -1, -1, -2, 3, 1}, new long[] {1, 2, 7, 11, 27, 44, 91, 147, 278, 450});
  }
}
