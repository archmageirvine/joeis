package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155095 Numbers n such that <code>n^2 == -1 mod</code> (17).
 * @author Sean A. Irvine
 */
public class A155095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155095() {
    super(new long[] {-1, 1, 1}, new long[] {4, 13, 21});
  }
}
