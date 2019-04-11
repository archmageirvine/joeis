package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170931 Extended Lucas L(n,i) = n*(L(n,i-1) + L(n,i-2)) = a^i + b^i where d <code>= sqrt(n*(n+4))</code>; a=(n+d)/2; b=(n-d)/2.
 * @author Sean A. Irvine
 */
public class A170931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170931() {
    super(new long[] {4, 4}, new long[] {2, 4});
  }
}
