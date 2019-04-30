package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110344 <code>a(n) = sum( n+k, k=0..n-1 ) = n(3n-1)/2</code> if n is even; <code>a(n) = sum( n-k, k=0..n-1 ) = n(n+1)/2</code> if n is odd.
 * @author Sean A. Irvine
 */
public class A110344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110344() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 5, 6, 22, 15, 51});
  }
}
