package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165935.
 * @author Sean A. Irvine
 */
public class A165935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165935() {
    super(new long[] {-1, -6, -15, -20, -15, -6}, new long[] {1, -242, 2883, -13924, 45125, -115926});
  }
}
