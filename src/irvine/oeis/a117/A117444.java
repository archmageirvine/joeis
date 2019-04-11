package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117444 Period 5: Repeat <code>[0, 1, 2, -2, -1]</code>.
 * @author Sean A. Irvine
 */
public class A117444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117444() {
    super(new long[] {-1, -1, -1, -1}, new long[] {0, 1, 2, -2});
  }
}
