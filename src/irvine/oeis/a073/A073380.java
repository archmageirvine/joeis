package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073380.
 * @author Sean A. Irvine
 */
public class A073380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073380() {
    super(new long[] {-1, -8, -20, -8, 26, 8, -20, 8}, new long[] {1, 8, 44, 200, 810, 3032, 10716, 36248});
  }
}
