package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165716.
 * @author Sean A. Irvine
 */
public class A165716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165716() {
    super(new long[] {2, 11, -4, 6, 2}, new long[] {1, 0, 5, 8, 55});
  }
}
