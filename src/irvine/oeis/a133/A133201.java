package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133201 a(n) = A133195(n)/3.
 * @author Sean A. Irvine
 */
public class A133201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133201() {
    super(new long[] {-10, 10, 0, 1}, new long[] {0, 1, 2, 3});
  }
}
