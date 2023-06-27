package irvine.oeis.a151;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A151675 Row sums of A154685.
 * @author Sean A. Irvine
 */
public class A151675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151675() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {8, 27, 63, 122});
  }
}
