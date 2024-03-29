package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276065 Sum of the asymmetry degrees of all compositions of n with parts in {1,5}.
 * @author Sean A. Irvine
 */
public class A276065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276065() {
    super(new long[] {-1, 0, 0, 0, -3, 1, 0, 0, -3, 2, 1, 0, -1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 2, 2, 4, 4, 6, 8, 16, 20, 34});
  }
}
