package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133631 a(n) = a(n-1) - 4*a(n-2), a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A133631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133631() {
    super(new long[] {-4, 1}, new long[] {1, 2});
  }
}
