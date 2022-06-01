package irvine.oeis.a055;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A055519 a(n) = 9*a(n-1) + 33*a(n-2) - 76*a(n-3) - 33*a(n-4) + 9*a(n-5) + a(n-6), a(0)=a(1)=1, a(2)=2, a(3)=35, a(4)=312, a(5)=3779.
 * @author Sean A. Irvine
 */
public class A055519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055519() {
    super(new long[] {1, 9, -33, -76, 33, 9}, new long[] {1, 2, 35, 312, 3779, 41590}, 1);
  }
}
