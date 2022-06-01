package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154815 Period 6: repeat [8, 7, 4, 5, 2, 1].
 * @author Sean A. Irvine
 */
public class A154815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154815() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {8, 7, 4, 5, 2, 1});
  }
}
