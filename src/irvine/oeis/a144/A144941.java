package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144941 Numbers k such that <code>6*k-1 =</code> A144796(k).
 * @author Sean A. Irvine
 */
public class A144941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144941() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 36, 753, 41348, 868769});
  }
}
