package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171654 Period <code>10</code>: repeat <code>0, 1, 6, 7, 2, 3, 8, 9, 4, 5</code>.
 * @author Sean A. Irvine
 */
public class A171654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171654() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 6, 7, 2, 3, 8, 9, 4, 5});
  }
}
