package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048910 Indices of 9-gonal numbers that are also square.
 * @author Sean A. Irvine
 */
public class A048910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048910() {
    super(new long[] {1, -1, -30, 30, 1}, new long[] {1, 2, 18, 49, 529});
  }
}
