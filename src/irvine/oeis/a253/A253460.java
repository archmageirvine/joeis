package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253460 Indices of centered heptagonal numbers <code>(A069099)</code> which are also centered square numbers <code>(A001844)</code>.
 * @author Sean A. Irvine
 */
public class A253460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253460() {
    super(new long[] {1, -1, -254, 254, 1}, new long[] {1, 16, 112, 3937, 28321});
  }
}
