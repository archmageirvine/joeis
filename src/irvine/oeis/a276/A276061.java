package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276061 Sum of the asymmetry degrees of all compositions of n into parts congruent to <code>1 mod 3</code>.
 * @author Sean A. Irvine
 */
public class A276061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276061() {
    super(new long[] {1, 0, 1, -2, -1, -1, -1, 0, -1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 2, 2, 4, 6, 10, 18, 28});
  }
}
