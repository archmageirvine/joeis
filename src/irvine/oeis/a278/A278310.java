package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278310 Numbers m such that T(m) + 3*T(m+1) is a square, where T = A000217.
 * @author Sean A. Irvine
 */
public class A278310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278310() {
    super(new long[] {1, -35, 35}, new long[] {3, 143, 4899});
  }
}
