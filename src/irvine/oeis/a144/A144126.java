package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144126.
 * @author Sean A. Irvine
 */
public class A144126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144126() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 8989, 213445, 1651609, 7544041, 25289461, 69125869});
  }
}
