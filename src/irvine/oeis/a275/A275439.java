package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275439 Sum of the asymmetry degrees of all compositions of n with parts in {1,2}.
 * @author Sean A. Irvine
 */
public class A275439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275439() {
    super(new long[] {-1, -3, -2, 1, 2, 1}, new long[] {0, 0, 0, 2, 2, 6});
  }
}
