package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278310 Numbers m such that <code>T(m) + 3*T(m+1)</code> is a square, where T <code>= A000217</code>.
 * @author Sean A. Irvine
 */
public class A278310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278310() {
    super(new long[] {1, -35, 35}, new long[] {3, 143, 4899});
  }
}
