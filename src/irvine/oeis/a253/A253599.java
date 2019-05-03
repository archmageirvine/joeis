package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253599 Centered square numbers <code>(A001844)</code> which are also centered heptagonal numbers <code>(A069099)</code>.
 * @author Sean A. Irvine
 */
public class A253599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253599() {
    super(new long[] {1, -1, -64514, 64514, 1}, new long[] {1, 841, 43513, 54236113, 2807177521L});
  }
}
