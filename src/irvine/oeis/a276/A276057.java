package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276057.
 * @author Sean A. Irvine
 */
public class A276057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276057() {
    super(new long[] {-1, 0, -3, 1, -3, 2, 0, 1, 1}, new long[] {0, 0, 0, 0, 2, 2, 4, 6, 14});
  }
}
