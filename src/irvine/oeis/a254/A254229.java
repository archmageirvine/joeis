package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254229 Indices of centered square numbers (A001844) which are also heptagonal numbers (A000566).
 * @author Sean A. Irvine
 */
public class A254229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254229() {
    super(1, new long[] {1, -1, -322, 322, 1}, new long[] {1, 46, 207, 14652, 66493});
  }
}
