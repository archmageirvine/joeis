package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233289.
 * @author Sean A. Irvine
 */
public class A233289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233289() {
    super(new long[] {-1, 1, -3, 4, -7, -11, 2, 13, 0, 3}, new long[] {1, 2, 4, 21, 92, 320, 1213, 4822, 18556, 70929});
  }
}
