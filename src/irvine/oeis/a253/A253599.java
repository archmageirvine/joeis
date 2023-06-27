package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253599 Centered square numbers (A001844) which are also centered heptagonal numbers (A069099).
 * @author Sean A. Irvine
 */
public class A253599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253599() {
    super(1, new long[] {1, -1, -64514, 64514, 1}, new long[] {1, 841, 43513, 54236113, 2807177521L});
  }
}
