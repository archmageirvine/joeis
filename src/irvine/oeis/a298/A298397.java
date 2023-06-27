package irvine.oeis.a298;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A298397 Pentagonal numbers divisible by 4.
 * @author Sean A. Irvine
 */
public class A298397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A298397() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 12, 92, 176, 376});
  }
}
