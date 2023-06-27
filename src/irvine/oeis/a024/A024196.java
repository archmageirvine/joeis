package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024196 a(n) = 2nd elementary symmetric function of the first n+1 odd positive integers.
 * @author Sean A. Irvine
 */
public class A024196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024196() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {3, 23, 86, 230, 505});
  }
}
