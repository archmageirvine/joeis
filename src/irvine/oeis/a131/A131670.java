package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131670 Period 5: repeat [1, 0, -1, 0, 1].
 * @author Sean A. Irvine
 */
public class A131670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131670() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 0, -1, 0, 1});
  }
}
