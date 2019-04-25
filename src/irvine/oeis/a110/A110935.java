package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110935 <code>a(n) =</code> if <code>n mod 2 = 0</code> then <code>8*F(n)-n</code> otherwise <code>8*F(n)-4,</code> where <code>F() =</code> Fibonacci numbers A000045.
 * @author Sean A. Irvine
 */
public class A110935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110935() {
    super(new long[] {1, 1, -3, -2, 3, 1}, new long[] {0, 4, 6, 12, 20, 36});
  }
}
