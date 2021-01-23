package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268428 a(n) = (3*(n^2+n+99)+cos(Pi*n/2)-sin(Pi*n/2))/2.
 * @author Sean A. Irvine
 */
public class A268428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268428() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {149, 151, 157, 167, 179});
  }
}
