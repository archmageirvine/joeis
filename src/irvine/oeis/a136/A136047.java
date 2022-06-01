package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136047 a(1)=1, a(n)=a(n-1)+n if n even, a(n)=a(n-1)+ n^2 if n is odd.
 * @author Sean A. Irvine
 */
public class A136047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136047() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 3, 12, 16, 41, 47, 96});
  }
}
