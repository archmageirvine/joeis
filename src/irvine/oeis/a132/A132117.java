package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132117 Binomial transform of [1, 7, 17, 17, 6, 0, 0, 0, ...].
 * @author Sean A. Irvine
 */
public class A132117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132117() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 8, 32, 90, 205});
  }
}
