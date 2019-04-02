package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245477 Period 6: repeat [1, 1, 1, 1, 1, 2].
 * @author Sean A. Irvine
 */
public class A245477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245477() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 2});
  }
}
