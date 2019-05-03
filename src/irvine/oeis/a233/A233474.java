package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233474 Numbers m such that <code>5*T(m)-1</code> is a square, where T <code>= A000217</code>.
 * @author Sean A. Irvine
 */
public class A233474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233474() {
    super(new long[] {1, -1, -38, 38, 1}, new long[] {1, 4, 52, 169, 1993});
  }
}
