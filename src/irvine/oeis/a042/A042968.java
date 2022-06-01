package irvine.oeis.a042;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A042968 Numbers not divisible by 4.
 * @author Sean A. Irvine
 */
public class A042968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042968() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 3, 5});
  }
}
