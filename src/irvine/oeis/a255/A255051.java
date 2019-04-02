package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255051 a(1)=1, a(n+1) = a(n)/gcd(a(n),n) if this GCD is &gt; 1, else a(n+1) = a(n) + n + 1.
 * @author Sean A. Irvine
 */
public class A255051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255051() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 3, 6, 2, 1, 7, 14, 2});
  }
}
