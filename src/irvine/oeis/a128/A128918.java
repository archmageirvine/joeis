package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128918 a(n) = n*(n+1)/2 if n is odd, otherwise (n-1)*n/2 + 1.
 * @author Sean A. Irvine
 */
public class A128918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128918() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 1, 2, 6, 7});
  }
}
