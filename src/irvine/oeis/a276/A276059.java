package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276059 Sum of the asymmetry degrees of all compositions of n with parts in {3,4,5,6, ...}.
 * @author Sean A. Irvine
 */
public class A276059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276059() {
    super(new long[] {-1, -1, -1, 0, 2, -1, 0, -1, 0, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 2, 2, 4});
  }
}
