package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133668 a(n) = a(n-1) - 36*a(n-2), a(0)=1, a(1)=6.
 * @author Sean A. Irvine
 */
public class A133668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133668() {
    super(new long[] {-36, 1}, new long[] {1, 6});
  }
}
