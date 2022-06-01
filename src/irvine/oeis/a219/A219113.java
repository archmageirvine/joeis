package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219113 Sequence of integers which are simultaneously a sum of consecutive squares and a difference of consecutive cubes.
 * @author Sean A. Irvine
 */
public class A219113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219113() {
    super(new long[] {1, -99, 99}, new long[] {1, 61, 5941});
  }
}
