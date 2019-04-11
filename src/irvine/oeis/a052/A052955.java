package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052955 <code>a(2n) = 2*2^n - 1, a(2n+1) = 3*2^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A052955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052955() {
    super(new long[] {-2, 2, 1}, new long[] {1, 2, 3});
  }
}
