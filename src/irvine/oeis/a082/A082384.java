package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082384 <code>a(0)=1, a(n)=2^n+n^2-2*a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A082384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082384() {
    super(new long[] {-4, 12, -11, 1, 3}, new long[] {1, 6, 5, 22, 13});
  }
}
