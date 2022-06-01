package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131379 Period 4: repeat [1, 0, -1, 1].
 * @author Sean A. Irvine
 */
public class A131379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131379() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 0, -1, 1});
  }
}
