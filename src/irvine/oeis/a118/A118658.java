package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118658 a(n) = 2*F(n-1) = L(n) - F(n), where F(n) and L(n) are Fibonacci and Lucas numbers respectively.
 * @author Sean A. Irvine
 */
public class A118658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118658() {
    super(new long[] {1, 1}, new long[] {2, 0});
  }
}
