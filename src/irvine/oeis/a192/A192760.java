package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192760.
 * @author Sean A. Irvine
 */
public class A192760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192760() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 1, 4, 9});
  }
}
