package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270797.
 * @author Sean A. Irvine
 */
public class A270797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270797() {
    super(new long[] {-4, 0, 5, 0}, new long[] {0, 1, 4, 3});
  }
}
