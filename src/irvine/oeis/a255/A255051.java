package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255051 <code>a(1)=1, a(n+1) =</code> a(n)/gcd(a(n),n) if this GCD is <code>&gt; 1,</code> else <code>a(n+1) = a(n) + n + 1</code>.
 * @author Sean A. Irvine
 */
public class A255051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255051() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 3, 6, 2, 1, 7, 14, 2});
  }
}
