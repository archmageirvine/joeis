package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171677 Period <code>9:repeat 7,5,7,4,2,4,1,8,1</code>.
 * @author Sean A. Irvine
 */
public class A171677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171677() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {7, 5, 7, 4, 2, 4, 1, 8, 1});
  }
}
