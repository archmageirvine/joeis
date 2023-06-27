package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140063 Binomial transform of [1, 3, 7, 0, 0, 0, ...].
 * @author Sean A. Irvine
 */
public class A140063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140063() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 4, 14});
  }
}
