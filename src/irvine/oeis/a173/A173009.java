package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173009.
 * @author Sean A. Irvine
 */
public class A173009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173009() {
    super(new long[] {2, -3, -1, 3}, new long[] {0, 1, 2, 6});
  }
}
