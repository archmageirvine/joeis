package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082383 <code>a(0)=1, a(n)=2^n+n-2*a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A082383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082383() {
    super(new long[] {4, -8, 3, 2}, new long[] {1, 1, 4, 3});
  }
}
