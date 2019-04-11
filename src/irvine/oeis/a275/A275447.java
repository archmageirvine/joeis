package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275447 Sum of the asymmetry degrees of all compositions of n with parts in <code>{2,1,3,5,7,9,...}</code>.
 * @author Sean A. Irvine
 */
public class A275447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275447() {
    super(new long[] {-1, 0, 3, 2, -2, -2, -3, -2, 2, 2}, new long[] {0, 0, 0, 2, 4, 10, 24, 54, 120, 258});
  }
}
