package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156854 2025n^2 - 3401n + 1428.
 * @author Sean A. Irvine
 */
public class A156854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156854() {
    super(new long[] {1, -3, 3}, new long[] {52, 2726, 9450});
  }
}
