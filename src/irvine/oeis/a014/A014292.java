package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014292.
 * @author Sean A. Irvine
 */
public class A014292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014292() {
    super(new long[] {-1, 0, -1, 2}, new long[] {0, 0, 1, 2});
  }
}

