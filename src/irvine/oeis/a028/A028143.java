package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028143.
 * @author Sean A. Irvine
 */
public class A028143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028143() {
    super(new long[] {-2880, 1728, -364, 32}, new long[] {1, 32, 660, 11200});
  }
}
