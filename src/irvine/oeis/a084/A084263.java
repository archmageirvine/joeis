package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084263 a(n) = (-1)^n/2+(n^2+n+1)/2.
 * @author Sean A. Irvine
 */
public class A084263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084263() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 1, 4, 6});
  }
}
