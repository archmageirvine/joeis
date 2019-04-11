package irvine.oeis.a223;

import irvine.oeis.LinearRecurrence;

/**
 * A223925 <code>a(2n+1) = 2*n-1</code>; <code>a(2n)= 4^n</code>.
 * @author Sean A. Irvine
 */
public class A223925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A223925() {
    super(new long[] {4, 0, -9, 0, 6, 0}, new long[] {1, 4, 3, 16, 5, 64});
  }
}
