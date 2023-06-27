package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007502 Les Marvin sequence: a(n) = F(n)+(n-1)*F(n-1), F() = Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A007502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007502() {
    super(1, new long[] {-1, -2, 1, 2}, new long[] {1, 2, 4, 9});
  }
}

