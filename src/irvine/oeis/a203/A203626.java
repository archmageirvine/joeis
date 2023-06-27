package irvine.oeis.a203;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A203626 Indices of decagonal numbers which are also octagonal.
 * @author Sean A. Irvine
 */
public class A203626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203626() {
    super(1, new long[] {1, -195, 195}, new long[] {1, 117, 22625});
  }
}
