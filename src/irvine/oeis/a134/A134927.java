package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134927 <code>a(0)=a(1)=1</code>; <code>a(n) = 3*(a(n-1) + a(n-2))</code>.
 * @author Sean A. Irvine
 */
public class A134927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134927() {
    super(new long[] {3, 3}, new long[] {1, 1});
  }
}
