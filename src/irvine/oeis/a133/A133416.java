package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133416 <code>a(n) = (1/10)*(2^(4*n-3)-5^n*F(2*n-1)+L(4*n-2))</code>, where <code>F() =</code> Fibonacci numbers <code>A000045</code> and <code>L() =</code> Lucas numbers <code>A000032</code>.
 * @author Sean A. Irvine
 */
public class A133416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133416() {
    super(new long[] {400, -3065, 2286, -483, 38}, new long[] {0, 0, 1, 91, 3060});
  }
}
