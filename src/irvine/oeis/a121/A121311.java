package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121311.
 * @author Sean A. Irvine
 */
public class A121311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121311() {
    super(new long[] {1, -2, 1}, new long[] {1, 2, 5});
  }
}
