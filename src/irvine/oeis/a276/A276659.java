package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276659 Accumulation of the upper left triangle used in binomial transform of nonnegative integers.
 * @author Sean A. Irvine
 */
public class A276659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276659() {
    super(new long[] {4, -16, 25, -19, 7}, new long[] {0, 2, 11, 39, 114});
  }
}
