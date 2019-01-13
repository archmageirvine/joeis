package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123004.
 * @author Sean A. Irvine
 */
public class A123004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123004() {
    super(new long[] {25, 2}, new long[] {0, 1});
  }
}
