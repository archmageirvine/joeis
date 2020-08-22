package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271751 Period 10 zigzag sequence; repeat: [0, 1, 2, 3, 4, 5, 4, 3, 2, 1].
 * @author Sean A. Irvine
 */
public class A271751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271751() {
    super(new long[] {1, -1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5});
  }
}
