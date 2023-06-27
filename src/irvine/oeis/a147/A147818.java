package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147818 Period 4: repeat [5, 9, 9, 5].
 * @author Sean A. Irvine
 */
public class A147818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147818() {
    super(1, new long[] {1, -1, 1}, new long[] {5, 9, 9});
  }
}
