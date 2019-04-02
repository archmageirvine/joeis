package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033622 Good sequence of increments for Shell sort (best on big values).
 * @author Sean A. Irvine
 */
public class A033622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033622() {
    super(new long[] {8, -8, -6, 6, 1}, new long[] {1, 5, 19, 41, 109});
  }
}
