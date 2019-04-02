package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133294 a(n) = 2*a(n-1) + 10*a(n-2), a(0)=1, a(1)=1 .
 * @author Sean A. Irvine
 */
public class A133294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133294() {
    super(new long[] {10, 2}, new long[] {1, 1});
  }
}
