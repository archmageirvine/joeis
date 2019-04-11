package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133847 <code>a(n)*a(n-9) = a(n-1)*a(n-8)+a(n-4)+a(n-5)</code> with initial terms <code>a(1)=...=a(9)=1</code>.
 * @author Sean A. Irvine
 */
public class A133847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133847() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, -68, 0, 0, 0, 0, 0, 0, 0, 68, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 5, 7, 9, 13, 21, 33, 49, 169, 293, 421, 553, 823, 1365, 2179});
  }
}
