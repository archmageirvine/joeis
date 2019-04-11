package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275445 Sum of the asymmetry degrees of all compositions of n with parts in <code>{1,2,3}</code>.
 * @author Sean A. Irvine
 */
public class A275445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275445() {
    super(new long[] {-1, -3, -6, -6, -4, 0, 2, 2, 1}, new long[] {0, 0, 0, 2, 4, 10, 22, 50, 106});
  }
}
