package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133672 a(n)=a(n-1)-81*a(n-2), a(0)=1, a(1)=9 .
 * @author Sean A. Irvine
 */
public class A133672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133672() {
    super(new long[] {-81, 1}, new long[] {1, 9});
  }
}
