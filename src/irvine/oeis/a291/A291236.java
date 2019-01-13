package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291236.
 * @author Sean A. Irvine
 */
public class A291236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291236() {
    super(new long[] {-1, -4, -1, 4}, new long[] {4, 13, 44, 147});
  }
}
