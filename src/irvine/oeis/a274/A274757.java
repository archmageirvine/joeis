package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274757 Numbers k such that <code>6*k+1</code> is a triangular number <code>(A000217)</code>.
 * @author Sean A. Irvine
 */
public class A274757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274757() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 9, 15, 42, 54});
  }
}
