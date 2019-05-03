package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196876 <code>a(n) = a(n-no-1)+....+a(n-1)+(n-no-2)</code> where no is the <code>'no+1'th</code> order of the series and 'n' is the element number, here <code>no=6</code>.
 * @author Sean A. Irvine
 */
public class A196876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196876() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, -2, 3}, new long[] {1, 1, 1, 1, 1, 1, 1, 7, 14});
  }
}
