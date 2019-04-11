package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133416 <code>a(n) =</code> (1/10)*(2^(4*n-3)-5^n*F(2*n-1)+L(4*n-2)), where F() = Fibonacci numbers A000045 and L() = Lucas numbers A000032.
 * @author Sean A. Irvine
 */
public class A133416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133416() {
    super(new long[] {400, -3065, 2286, -483, 38}, new long[] {0, 0, 1, 91, 3060});
  }
}
