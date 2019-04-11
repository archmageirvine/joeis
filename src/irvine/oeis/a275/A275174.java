package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275174 <code>a(n) = (a(n-4) + a(n-1) * a(n-7)) / a(n-8), a(0) = a(1) = ... = a(7) = 1</code>.
 * @author Sean A. Irvine
 */
public class A275174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275174() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, -23, 0, 0, 0, 0, 0, 0, 23, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 7, 10, 14, 33, 53, 74, 96, 141, 209});
  }
}
