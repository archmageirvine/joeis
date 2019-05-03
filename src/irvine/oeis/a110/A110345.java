package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110345 <code>a(n) = n +(n+1) +(n+2)... n</code> terms if n is odd, else <code>a(n) = n + (n-1) + (n-2)</code> ... n terms <code>= n(n+1)/2 = n-th</code> triangular number if n is even.
 * @author Sean A. Irvine
 */
public class A110345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110345() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 3, 12, 10, 35, 21});
  }
}
