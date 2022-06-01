package irvine.oeis.a230;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A230462 Numbers congruent to {1, 11, 13, 17, 19, or 29} mod 30.
 * @author Sean A. Irvine
 */
public class A230462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230462() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 11, 13, 17, 19, 29, 31});
  }
}
