package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131870 Period 8: repeat [1, 2, 3, 4, 6, 7, 8, 9].
 * @author Sean A. Irvine
 */
public class A131870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131870() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 4, 6, 7, 8, 9});
  }
}
