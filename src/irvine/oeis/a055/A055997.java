package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055997 Numbers n such that <code>n(n-1)/2</code> is a square.
 * @author Sean A. Irvine
 */
public class A055997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055997() {
    super(new long[] {1, -7, 7}, new long[] {1, 2, 9});
  }
}
