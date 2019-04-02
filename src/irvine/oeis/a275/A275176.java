package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275176 a(n) = (3 * a(n-3) + a(n-1) * a(n-5)) / a(n-6), a(0) = a(1) = ... = a(5) = 1.
 * @author Sean A. Irvine
 */
public class A275176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275176() {
    super(new long[] {1, 0, 0, 0, 0, -60, 0, 0, 0, 0, 60, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 4, 7, 10, 22, 43, 202, 370, 547, 1264});
  }
}
