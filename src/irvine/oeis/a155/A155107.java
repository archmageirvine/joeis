package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155107.
 * @author Sean A. Irvine
 */
public class A155107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155107() {
    super(new long[] {-1, 1, 1}, new long[] {23, 30, 76});
  }
}
