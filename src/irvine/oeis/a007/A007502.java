package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007502 Les Marvin sequence: <code>a(n) = F(n)+(n-1)*F(n-1), F() =</code> Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A007502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007502() {
    super(new long[] {-1, -2, 1, 2}, new long[] {1, 2, 4, 9});
  }
}

