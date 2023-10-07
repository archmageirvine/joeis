package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082987 a(n) = Sum_{k=0..n} 3^k*F(k) where F(k) is the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A082987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082987() {
    super(0, new long[] {-9, 6, 4}, new long[] {0, 3, 12});
  }
}
