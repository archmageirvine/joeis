package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124292.
 * @author Sean A. Irvine
 */
public class A124292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124292() {
    super(new long[] {3, -9, 6}, new long[] {1, 1, 2});
  }
}
