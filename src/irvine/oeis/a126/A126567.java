package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126567.
 * @author Sean A. Irvine
 */
public class A126567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126567() {
    super(new long[] {-3, 52, -125, 120, -55, 12}, new long[] {1, 2, 5, 14, 42, 132});
  }
}
