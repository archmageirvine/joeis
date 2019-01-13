package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151754.
 * @author Sean A. Irvine
 */
public class A151754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151754() {
    super(new long[] {-2, 3, -3, 3}, new long[] {1, 3, 7, 14});
  }
}
