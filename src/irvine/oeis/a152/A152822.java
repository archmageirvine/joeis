package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152822 Periodic sequence [1,1,0,1] of length 4.
 * @author Sean A. Irvine
 */
public class A152822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152822() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 1, 0, 1});
  }
}
