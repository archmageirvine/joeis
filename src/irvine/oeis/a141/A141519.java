package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141519 Period 10: repeat <code>-1, 1, -3, 7, -5, 3, -7, 9, -9, 5</code>.
 * @author Sean A. Irvine
 */
public class A141519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141519() {
    super(new long[] {-1, -1, -1, -1, -1, -1, -1, -1, -1}, new long[] {-1, 1, -3, 7, -5, 3, -7, 9, -9});
  }
}
