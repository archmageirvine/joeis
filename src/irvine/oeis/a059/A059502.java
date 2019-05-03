package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059502 <code>a(n) = (3*n*F(2n-1) + (3-n)*F(2n))/5</code> where <code>F() =</code> Fibonacci numbers <code>A000045</code>.
 * @author Sean A. Irvine
 */
public class A059502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059502() {
    super(new long[] {-1, 6, -11, 6}, new long[] {0, 1, 3, 9});
  }
}
