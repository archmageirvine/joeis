package irvine.oeis.a066;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A066771 a(n) = 5^n*cos(2*n*arctan(1/2)) or denominator of tan(2*n*arctan(1/2)).
 * @author Sean A. Irvine
 */
public class A066771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066771() {
    super(new long[] {-25, 6}, new long[] {1, 3});
  }
}
