package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144930 Numbers k arising in A144929.
 * @author Sean A. Irvine
 */
public class A144930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144930() {
    super(1, new long[] {-1, 110}, new long[] {1, 109});
  }
}
