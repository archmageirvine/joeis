package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138573 <code>a(n) = 2*a(n-1) + 2*a(n-2) + 2*a(n-3) - a(n-4)</code>; <code>a(0)=0, a(1)=1, a(2)=2, a(3)=5</code>.
 * @author Sean A. Irvine
 */
public class A138573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138573() {
    super(new long[] {-1, 2, 2, 2}, new long[] {0, 1, 2, 5});
  }
}
