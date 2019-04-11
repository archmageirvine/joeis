package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133326 Numbers n such that <code>2*n^2 + 41</code> is a square.
 * @author Sean A. Irvine
 */
public class A133326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133326() {
    super(new long[] {-1, 0, 6, 0}, new long[] {2, 8, 20, 50});
  }
}
