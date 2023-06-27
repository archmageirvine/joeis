package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174529 a(3n) = a(3n-1)+a(3n-2), a(3n+1) = a(3n)*a(3n-1), a(3n+2) = a(3n+1)/a(3n).
 * @author Sean A. Irvine
 */
public class A174529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174529() {
    super(1, new long[] {-5, 0, 0, 6, 0, 0}, new long[] {3, 5, 8, 40, 5, 45});
  }
}
