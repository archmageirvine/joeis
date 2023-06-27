package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254374 Digital roots of centered pentagonal numbers (A005891).
 * @author Sean A. Irvine
 */
public class A254374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254374() {
    super(1, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 6, 7, 4, 6, 4, 7, 6, 1});
  }
}
