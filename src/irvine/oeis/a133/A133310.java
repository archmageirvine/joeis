package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133310 <code>a(3n) = 2n+1, a(3n+1) = 2n+2, a(3n+2) = 2n+1</code>.
 * @author Sean A. Irvine
 */
public class A133310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133310() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 1, 3});
  }
}
