package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024178 a(n) = floor(3rd elementary symmetric function of 2,3,...,n+3)/(2+3+...+n+3)).
 * @author Sean A. Irvine
 */
public class A024178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024178() {
    super(1, new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {2, 11, 29, 61, 115, 196, 312});
  }
}
