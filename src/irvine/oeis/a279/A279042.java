package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279042 Numbers k such that <code>2*k+1</code> and <code>10*k+1</code> are both triangular numbers (A000217).
 * @author Sean A. Irvine
 */
public class A279042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279042() {
    super(new long[] {1, -1, -103682, 103682, 1}, new long[] {4455, 30537, 461938302, 3166172226L, 47894687058501L});
  }
}
