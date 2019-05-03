package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144930 Numbers k arising in <code>A144929</code>.
 * @author Sean A. Irvine
 */
public class A144930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144930() {
    super(new long[] {-1, 110}, new long[] {1, 109});
  }
}
