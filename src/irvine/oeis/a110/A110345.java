package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110345 a(n) = n + (n+1) + (n+2) + ... n terms if n is odd, else a(n) = n + (n-1) + (n-2)  + ... n terms = n(n+1)/2 = n-th triangular number if n is even.
 * @author Sean A. Irvine
 */
public class A110345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110345() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 3, 12, 10, 35, 21});
  }
}
