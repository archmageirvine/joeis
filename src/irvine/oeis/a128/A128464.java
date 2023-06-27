package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128464 Numbers that are congruent to {11, 17, 29} mod 30.
 * @author Sean A. Irvine
 */
public class A128464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128464() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {11, 17, 29, 41});
  }
}
