package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253460 Indices of centered heptagonal numbers (A069099) which are also centered square numbers (A001844).
 * @author Sean A. Irvine
 */
public class A253460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253460() {
    super(1, new long[] {1, -1, -254, 254, 1}, new long[] {1, 16, 112, 3937, 28321});
  }
}
