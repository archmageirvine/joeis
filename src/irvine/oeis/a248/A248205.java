package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248205 Indices of centered octagonal numbers (A016754) that are also pentagonal numbers (A000326).
 * @author Sean A. Irvine
 */
public class A248205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248205() {
    super(new long[] {1, -99, 99}, new long[] {1, 50, 4851});
  }
}
