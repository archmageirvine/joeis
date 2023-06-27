package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253447 Indices of centered octagonal numbers (A016754) which are also centered heptagonal numbers (A069099).
 * @author Sean A. Irvine
 */
public class A253447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253447() {
    super(1, new long[] {1, -31, 31}, new long[] {1, 15, 435});
  }
}
