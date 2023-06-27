package irvine.oeis.a275;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A275874 a(n) = (n-4)*(n+1)*(n+3)/6.
 * @author Sean A. Irvine
 */
public class A275874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275874() {
    super(4, new long[] {-1, 4, -6, 4}, new long[] {0, 8, 21, 40});
  }
}
