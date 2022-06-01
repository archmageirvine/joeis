package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133847 a(n)*a(n-9) = a(n-1)*a(n-8)+a(n-4)+a(n-5) with initial terms a(1)=...=a(9)=1.
 * @author Sean A. Irvine
 */
public class A133847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133847() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, -68, 0, 0, 0, 0, 0, 0, 0, 68, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 5, 7, 9, 13, 21, 33, 49, 169, 293, 421, 553, 823, 1365, 2179});
  }
}
