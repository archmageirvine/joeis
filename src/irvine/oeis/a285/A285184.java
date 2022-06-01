package irvine.oeis.a285;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A285184 a(n) = 2*a(n-1) + a(n-3) with initial terms 1,3,5.
 * @author Sean A. Irvine
 */
public class A285184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285184() {
    super(new long[] {1, 0, 2}, new long[] {1, 3, 5});
  }
}
