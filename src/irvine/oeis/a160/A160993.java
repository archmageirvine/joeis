package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160993.
 * @author Sean A. Irvine
 */
public class A160993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160993() {
    super(new long[] {1, 1, 0, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 2, 3});
  }
}
