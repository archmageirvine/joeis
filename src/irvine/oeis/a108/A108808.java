package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108808.
 * @author Sean A. Irvine
 */
public class A108808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108808() {
    super(new long[] {-4, 6, 91, -75, 23}, new long[] {4, 74, 1434, 27780, 538150});
  }
}
