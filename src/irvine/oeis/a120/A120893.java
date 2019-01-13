package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120893.
 * @author Sean A. Irvine
 */
public class A120893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120893() {
    super(new long[] {-1, 3, 3}, new long[] {1, 1, 5});
  }
}
