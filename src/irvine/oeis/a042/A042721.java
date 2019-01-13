package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042721.
 * @author Sean A. Irvine
 */
public class A042721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042721() {
    super(new long[] {-1, 0, 0, 0, 358, 0, 0, 0}, new long[] {1, 1, 5, 6, 353, 359, 1789, 2148});
  }
}
