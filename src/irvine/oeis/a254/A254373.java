package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254373 Digital roots of centered square numbers (A001844).
 * @author Sean A. Irvine
 */
public class A254373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254373() {
    super(1, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 5, 4, 7, 5, 7, 4, 5, 1});
  }
}
