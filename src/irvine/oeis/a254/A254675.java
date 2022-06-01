package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254675 Indices of centered triangular numbers (A005448) which are also heptagonal numbers (A000566).
 * @author Sean A. Irvine
 */
public class A254675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254675() {
    super(new long[] {1, -1, -62, 62, 1}, new long[] {1, 13, 44, 776, 2697});
  }
}
