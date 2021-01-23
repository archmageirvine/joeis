package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104240 Nonnegative integers n such that 13*n^2 + 13*n + 1 is a square.
 * @author Sean A. Irvine
 */
public class A104240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104240() {
    super(new long[] {1, -1, 0, -1298, 1298, 0, 1}, new long[] {0, 7, 144, 504, 9727, 187560, 654840});
  }
}
