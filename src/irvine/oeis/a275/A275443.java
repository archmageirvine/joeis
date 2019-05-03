package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275443 Sum of the asymmetry degrees of all compositions of n without <code>2</code>'s.
 * @author Sean A. Irvine
 */
public class A275443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275443() {
    super(new long[] {-1, 1, -3, 1, 0, -2, 3}, new long[] {0, 0, 0, 0, 2, 4, 8});
  }
}
