package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226294 Period 2: repeat [6, 4].
 * @author Sean A. Irvine
 */
public class A226294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226294() {
    super(new long[] {1, 0}, new long[] {6, 4});
  }
}
