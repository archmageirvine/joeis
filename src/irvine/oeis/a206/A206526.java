package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206526 a(n) = 137*(n-1) - a(n-1) with n&gt;1, a(1)=31.
 * @author Sean A. Irvine
 */
public class A206526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206526() {
    super(1, new long[] {-1, 1, 1}, new long[] {31, 106, 168});
  }
}
