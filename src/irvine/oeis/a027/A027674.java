package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027674.
 * @author Sean A. Irvine
 */
public class A027674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027674() {
    super(new long[] {-1, 1, 1, 1, 1}, new long[] {-1, 1, 1, 1, 1});
  }
}
