package irvine.oeis.a196;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A196876 a(n) = a(n-no-1)+....+a(n-1)+(n-no-2) where no is the 'no+1'th order of the series and 'n' is the element number, here no=6.
 * @author Sean A. Irvine
 */
public class A196876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196876() {
    super(1, new long[] {1, -1, 0, 0, 0, 0, 0, -2, 3}, new long[] {1, 1, 1, 1, 1, 1, 1, 7, 14});
  }
}
