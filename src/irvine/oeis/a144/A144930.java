package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144930.
 * @author Sean A. Irvine
 */
public class A144930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144930() {
    super(new long[] {-1, 110}, new long[] {1, 109});
  }
}
