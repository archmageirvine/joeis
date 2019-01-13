package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144942.
 * @author Sean A. Irvine
 */
public class A144942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144942() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {0, 25, 532, 29237, 614312});
  }
}
