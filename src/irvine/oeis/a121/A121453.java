package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121453.
 * @author Sean A. Irvine
 */
public class A121453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121453() {
    super(new long[] {-1, 2, -2, 2}, new long[] {9, 24, 33, 48});
  }
}
