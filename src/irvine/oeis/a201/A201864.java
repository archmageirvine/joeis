package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201864 <code>((F(n-1)+F(n-2))-1)/2</code> if <code>F(n)</code> is odd, otherwise <code>((F(n-1)+F(n-2))-2)/2</code>, where <code>F(n)=A000045(n)</code> is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A201864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201864() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {0, 0, 0, 1, 2});
  }
}
