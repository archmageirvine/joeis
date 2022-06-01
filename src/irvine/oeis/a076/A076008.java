package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076008 Second column of triangle A075504.
 * @author Sean A. Irvine
 */
public class A076008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076008() {
    super(new long[] {-162, 27}, new long[] {1, 27});
  }
}
