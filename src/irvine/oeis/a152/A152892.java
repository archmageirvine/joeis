package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152892 Period 5: repeat [0, 3, 1, 0, 1].
 * @author Sean A. Irvine
 */
public class A152892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152892() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {0, 3, 1, 0, 1});
  }
}
