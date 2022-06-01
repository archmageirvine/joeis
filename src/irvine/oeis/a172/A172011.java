package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172011 12*A002605(n).
 * @author Sean A. Irvine
 */
public class A172011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172011() {
    super(new long[] {2, 2}, new long[] {0, 12});
  }
}
