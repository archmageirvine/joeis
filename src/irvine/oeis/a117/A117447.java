package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117447.
 * @author Sean A. Irvine
 */
public class A117447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117447() {
    super(new long[] {1, 1, 0, -1}, new long[] {1, 1, 2, 0});
  }
}
